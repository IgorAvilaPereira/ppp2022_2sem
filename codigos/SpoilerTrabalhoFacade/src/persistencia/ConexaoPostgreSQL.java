/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {
    private String host;
    private String password;
    private String username;
    private String dbname;
    private String port;

    public ConexaoPostgreSQL() {
        this.host = "localhost";
        this.username = "postgres";
        this.password = "postgres";
        this.port = "5432";
        this.dbname = "trabalho_facade";
    }
    
    public Connection getConexao() throws SQLException{
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        return DriverManager.getConnection(url, this.username, this.password);
    }
    
}
