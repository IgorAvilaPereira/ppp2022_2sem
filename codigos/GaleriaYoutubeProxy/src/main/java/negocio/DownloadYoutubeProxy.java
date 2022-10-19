package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class DownloadYoutubeProxy implements IDownload {

    private String dir;
    private ArrayList<String> videosJaBaixados;
    private DownloadYoutube downloadYoutube;

    public DownloadYoutubeProxy(String dir) throws IOException {

        this.dir = dir;
        this.videosJaBaixados = new ArrayList();
        try ( DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    this.videosJaBaixados.add(path.getFileName()
                            .toString());
                }
            }
        }

//        for (int i = 0; i < videosJaBaixados.size(); i++) {
//            String url_baixado = videosJaBaixados.get(i);
//            System.out.println(url_baixado);
//        }
    }

    @Override
    public void download(String url) {
        if (this.downloadYoutube == null && !this.jahBaixei(url)) {
            this.downloadYoutube = new DownloadYoutube();
            this.downloadYoutube.download(url);
            this.videosJaBaixados.add(downloadYoutube.getTitle());
        } else {
            System.out.println("ja foi baixado");
        }
    }

    private boolean jahBaixei(String url) {
        try {
            String python = """
                            import sys
                            from pytube import YouTube, Playlist
                            yt = YouTube(sys.argv[1])
                            print(yt.title)
                            """;

            try ( BufferedWriter out = new BufferedWriter(new FileWriter("PythonFromJava2.py"))) {
                out.write(python);
            }
            Process p = Runtime.getRuntime().exec("python3.10 PythonFromJava2.py " + url);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String title = in.readLine();
            for (int i = 0; i < videosJaBaixados.size(); i++) {
                String nome_baixados = videosJaBaixados.get(i);
                if (nome_baixados.substring(0, nome_baixados.indexOf(".")).equals(title)) {
                    return true;
                }
            }
        } catch (IOException e) {
        }

        return false;
    }

}
