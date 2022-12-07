/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


public class ContaCorrenteBuilder {

    private String nomeTitular;
    private String numeroTelefone;
    private int numeroConta;
    private double saldo;

    public ContaCorrenteBuilder(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaCorrenteBuilder nomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        return this;
    }

    public ContaCorrenteBuilder numeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        return this;
    }

    public ContaCorrenteBuilder numeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public ContaCorrenteBuilder saldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public ContaCorrente build() {
        return new ContaCorrente(nomeTitular, numeroTelefone, numeroConta, saldo);
    }
    
}
