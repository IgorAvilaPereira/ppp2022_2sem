/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apresentacao;

import java.sql.SQLException;
import modelo.Cliente;
import modelo.Endereco;
import persistencia.ClienteDAO;
import persistencia.EnderecoDAO;

/**
 *
 * @author iapereira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Cliente victor = new Cliente();
        victor.setNome("victor");
        victor.setCpf("66666666666");
        new ClienteDAO().inserir(victor);
        
        Endereco endereco = new Endereco();
        endereco.setCliente(victor);
        victor.getVetEndereco().add(endereco);
        endereco.setRua("aquidaban");
        endereco.setBairro("cidade nova");
        endereco.setComplemento("perto da unimed");
        endereco.setNro("123");
        new EnderecoDAO().inserir(endereco);
        
//        Cliente sergio = new Cliente();
//        sergio.setCpf("1111111111");
//        sergio.setNome("Sergio Pereira");
//        
//        ClienteDAO clienteDAO = new ClienteDAO();
//        if (!clienteDAO.existeCPF(sergio.getCpf())) {
//            boolean resultado = clienteDAO.inserir(sergio);
//            System.out.println("Cadastro?"+((resultado) ? "Sim" : "Não"));
//        } else {
//            System.out.println("Cliente já cadastrado anteriormente...");
//        }
    }
    
}
