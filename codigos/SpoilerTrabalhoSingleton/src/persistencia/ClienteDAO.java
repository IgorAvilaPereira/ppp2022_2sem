/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import modelo.Cliente;
import java.sql.*;
import log.Log;

/**
 *
 * @author iapereira
 */
public class ClienteDAO {
//    private ConexaoPostgreSQL conexaoPostgreSQL;
    
    public ClienteDAO(){        
//        ConexaoPostgreSQL. = new ConexaoPostgreSQL();
    }
    
    public boolean existeCPF(String cpf) throws SQLException{
        Connection connection = ConexaoPostgreSQL.getInstance();
        String consulta = "SELECT * FROM cliente WHERE cpf = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(consulta);
        preparedStatement.setString(1, cpf);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean resultado = false;
        if (resultSet.next()){
            resultado = true;
        }
//        connection.close();
        return resultado;
    }
    
    public boolean inserir(Cliente cliente) throws SQLException{
        Connection connection = ConexaoPostgreSQL.getInstance();
        String instrucao = "INSERT INTO cliente (cpf, nome) VALUES (?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(instrucao);
        preparedStatement.setString(1, cliente.getCpf());
        preparedStatement.setString(2, cliente.getNome());
        int resultado = preparedStatement.executeUpdate();
//        connection.close();        
         Log.getInstance().registraLog("inserindo cliente");
        return resultado == 1; 
    }
    
}
