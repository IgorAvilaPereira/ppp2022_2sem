/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // lendo e colocando tudo em um arraylist de objetos de pessoa
        Scanner sc = new Scanner(new File("/home/iapereira/dados.csv"));
        String linha;
        String vetLinha[] = new String[3];
        int id;
        String nome;
        String estado_civil;
        ArrayList<Pessoa> vetPessoa = new ArrayList();
        while (sc.hasNext()) {
            linha = sc.next();
            vetLinha = linha.split(";");
            id = Integer.parseInt(vetLinha[0]);
            nome = vetLinha[1];
            estado_civil = vetLinha[2];
            vetPessoa.add(new Pessoa(id, nome, estado_civil));

        }
        sc.close();

        
        // formatando para exportacao. No caso HTML tosco!!
        String arq = "";
        for (int i = 0; i < vetPessoa.size(); i++) {
            Pessoa p = vetPessoa.get(i);
            arq += "*" + p.getNome() + "<br>";

        }

        try ( PrintWriter out = new PrintWriter("/home/iapereira/dados.html")) {
            out.println(arq);
        }

    }

}
