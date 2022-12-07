/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class ContaCorrente {
    private String nomeTitular;
    private String numeroTelefone;
    
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public ContaCorrente(String nomeTitular, String numeroTelefone, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroTelefone = numeroTelefone;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
