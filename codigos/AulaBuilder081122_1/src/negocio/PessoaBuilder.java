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
  public class PessoaBuilder {
        int id;
        String nome;
        String sobrenome;
        String cpf;
        boolean ehAssinante;
        LocalDate dataNascimento;
        boolean temDependente;

        public PessoaBuilder(int id) {
            this.id = id;

        }

//        public PessoaBuilder id(int id) {
//            this.id = id;
//            return this;
//        }

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

        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public PessoaBuilder temDependente(boolean temDependente) {
            this.temDependente = temDependente;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(this);
        }
        
        

    }