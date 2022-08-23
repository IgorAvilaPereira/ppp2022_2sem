/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import negocio.Cliente;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class ClienteDAO {

    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> vetCliente = new ArrayList<>();
        Connection conexao = new ConexaoPostgreSQL().getConexao();
        String sql = "SELECT * FROM cliente";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conexao.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vetCliente.add(new Cliente(rs.getInt("id"), rs.getString("nome")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vetCliente;

    }

}
