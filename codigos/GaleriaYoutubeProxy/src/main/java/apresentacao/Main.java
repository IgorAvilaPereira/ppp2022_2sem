/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apresentacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import negocio.DownloadYoutube;
import negocio.DownloadYoutubeProxy;

/**
 *
 * @author iapereira
 */
public class Main {
    
    public static void main(String a[]) throws IOException {
        
        DownloadYoutubeProxy downloadYoutubeProxy = new DownloadYoutubeProxy("video");
//        downloadYoutubeProxy.download("https://youtu.be/jWFT7LPoc9g");
        downloadYoutubeProxy.download("https://youtu.be/eaFeDEYeqDA");
    }
}
