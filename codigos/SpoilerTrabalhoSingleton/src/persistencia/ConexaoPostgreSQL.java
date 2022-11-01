/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change ConexaoPostgreSQL. license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit ConexaoPostgreSQL. template
 */
package persistencia;

import java.sql.*;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {

    private static final String host = "localhost";
    private static final String password = "postgres";
    private static final String username = "postgres";
    private static final String dbname = "trabalho_facade";
    private static final String port = "5432";

    private static Connection instance = null;

    private ConexaoPostgreSQL() {
//        System.out.println(instance.hashCode());
//        ConexaoPostgreSQL.host = "localhost";
//        ConexaoPostgreSQL.username = "postgres";
//        ConexaoPostgreSQL.password = "postgres";
//        ConexaoPostgreSQL.port = "5432";
//        ConexaoPostgreSQL.dbname = "trabalho_facade";
    }

    public static synchronized Connection getInstance() throws SQLException {
        String url = "jdbc:postgresql://" + ConexaoPostgreSQL.host + ":" + ConexaoPostgreSQL.port + "/" + ConexaoPostgreSQL.dbname;
        if (instance == null) {
            instance = DriverManager.getConnection(url, ConexaoPostgreSQL.username, ConexaoPostgreSQL.password);
        }
        System.out.println(instance.hashCode());

        return instance;

    }

}
