/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import org.immutables.builder.Builder;


/**
 *
 * @author iapereira
 */
public class Pessoa {

    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private boolean ehAssinante;
    private boolean temDependente;
    
    @Builder.Constructor
    Pessoa(int id, String nome, String sobrenome, String cpf, boolean ehAssinante, boolean temDependente) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.ehAssinante = ehAssinante;
        this.temDependente = temDependente;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isEhAssinante() {
        return ehAssinante;
    }

    public boolean isTemDependente() {
        return temDependente;
    }
    
    
    
    

    
}
