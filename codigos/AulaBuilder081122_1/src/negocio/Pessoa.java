/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;

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
    private LocalDate dataNascimento;
    private boolean temDependente;

    private Pessoa(int id, String nome, String sobrenome, String cpf, boolean ehAssinante, LocalDate dataNascimento, boolean temDependente) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.ehAssinante = ehAssinante;
        this.dataNascimento = dataNascimento;
        this.temDependente = temDependente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isEhAssinante() {
        return ehAssinante;
    }

    public void setEhAssinante(boolean ehAssinante) {
        this.ehAssinante = ehAssinante;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isTemDependente() {
        return temDependente;
    }

    public void setTemDependente(boolean temDependente) {
        this.temDependente = temDependente;
    }
    
   

    Pessoa(PessoaBuilder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.cpf = builder.cpf;
        this.ehAssinante = builder.ehAssinante;
        this.dataNascimento = builder.dataNascimento;
        this.temDependente = builder.temDependente;

    }
    
    
}