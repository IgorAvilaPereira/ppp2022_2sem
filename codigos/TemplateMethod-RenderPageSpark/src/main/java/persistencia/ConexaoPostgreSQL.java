/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {
    private String host;
    private String port;
    private String dbname;
    private String username;
    private String password;
    
    public ConexaoPostgreSQL(){
        this.host =  "localhost";
        this.port = "5432";
        this.dbname = "aula230822";
        this.username = "postgres";
        this.password = "postgres";
    }
    
    public Connection getConexao(){
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.dbname;
        try {
            return DriverManager.getConnection(url, this.username, this.password);
        } catch (SQLException ex) {
            System.out.println("Deu xabum!!");
            Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
