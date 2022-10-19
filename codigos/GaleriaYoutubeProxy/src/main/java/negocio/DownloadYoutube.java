package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class DownloadYoutube implements IDownload {
    private String title;
    private String url;

    @Override
    public void download(String url) {
        try {
            String python = """
                            import sys
                            from pytube import YouTube, Playlist
                            yt = YouTube(sys.argv[1])
                            video = yt.streams.get_highest_resolution()        
                            video.download(output_path='video')
                            print(yt.title)
                            """;

            try ( BufferedWriter out = new BufferedWriter(new FileWriter("PythonFromJava.py"))) {
                out.write(python);
            }
            Process p = Runtime.getRuntime().exec("python3.10 PythonFromJava.py " + url);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            this.title =  in.readLine();
            this.url = url;
        } catch (IOException e) {
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    

}
