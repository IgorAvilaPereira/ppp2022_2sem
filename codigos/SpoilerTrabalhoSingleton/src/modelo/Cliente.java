/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author iapereira
 */
public class Cliente {
    private String cpf;
    private String nome;
    private ArrayList<Endereco> vetEndereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Cliente(){
        this.vetEndereco = new ArrayList<>();
    }

    public ArrayList<Endereco> getVetEndereco() {
        return vetEndereco;
    }

    public void setVetEndereco(ArrayList<Endereco> vetEndereco) {
        this.vetEndereco = vetEndereco;
    }
    
    
    
    
    
}
