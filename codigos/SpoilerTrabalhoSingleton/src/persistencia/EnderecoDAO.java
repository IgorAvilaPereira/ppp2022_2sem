/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import log.Log;
import modelo.Cliente;
import modelo.Endereco;

/**
 *
 * @author iapereira
 */
public class EnderecoDAO {
//     private ConexaoPostgreSQL conexaoPostgreSQL;
    
    public EnderecoDAO(){        
//        this.conexaoPostgreSQL = new ConexaoPostgreSQL();
    }
    
     public boolean inserir(Endereco endereco) throws SQLException{
        Connection connection = ConexaoPostgreSQL.getInstance();
        String instrucao = "INSERT INTO endereco (rua, bairro, complemento, nro, cliente_cpf) VALUES (?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(instrucao);
        preparedStatement.setString(1, endereco.getRua());
        preparedStatement.setString(2, endereco.getBairro());
        
        preparedStatement.setString(3, endereco.getComplemento());
        
        preparedStatement.setString(4, endereco.getNro());
        
        preparedStatement.setString(5, endereco.getCliente().getCpf());
        int resultado = preparedStatement.executeUpdate();
//        connection.close();     
         Log.getInstance().registraLog("inserindo endereco");

        return resultado == 1; 
    }
    
}
