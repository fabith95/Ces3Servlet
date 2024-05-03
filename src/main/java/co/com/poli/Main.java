package co.com.poli;

import co.com.poli.database.ConexionMySql;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ConexionMySql conection = new ConexionMySql();
        try {
            conection.getUsers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}