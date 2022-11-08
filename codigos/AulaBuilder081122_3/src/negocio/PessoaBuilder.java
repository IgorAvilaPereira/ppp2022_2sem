/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


public class PessoaBuilder {

    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private boolean ehAssinante;
    private boolean temDependente;

    public PessoaBuilder() {
    }

    public PessoaBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder ehAssinante(boolean ehAssinante) {
        this.ehAssinante = ehAssinante;
        return this;
    }

    public PessoaBuilder temDependente(boolean temDependente) {
        this.temDependente = temDependente;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(id, nome, sobrenome, cpf, ehAssinante, temDependente);
    }
    
}
