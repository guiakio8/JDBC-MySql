package poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public static Connection conectaDB() {
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost", "root", "admin123");
        } catch (ClassNotFoundException e) {
            System.out.println("Problema no Driver" + e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return conexao;
    }
}
