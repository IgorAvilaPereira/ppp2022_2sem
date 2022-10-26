/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.sql.SQLException;
import modelo.Cliente;
import persistencia.ClienteDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Cliente sergio = new Cliente();
        sergio.setCpf("1111111111");
        sergio.setNome("Sergio Pereira");
        
        ClienteDAO clienteDAO = new ClienteDAO();
        if (!clienteDAO.existeCPF(sergio.getCpf())) {
            boolean resultado = clienteDAO.inserir(sergio);
            System.out.println("Cadastro?"+((resultado) ? "Sim" : "Não"));
        } else {
            System.out.println("Cliente já cadastrado anteriormente...");
        }
    }
    
}
