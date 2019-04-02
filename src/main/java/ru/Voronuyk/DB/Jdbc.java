package ru.Voronuyk.DB;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb_test" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";


    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            if (!connection.isClosed()) {
                System.out.println("Соединение устоновлено с базой данных");
            }



            if (connection.isClosed()){
                System.out.println("Соединение закрыто");
            }
        } catch (Exception e) {
            System.out.println("Не взлетело :0 , драйвер jdbc");
        }finally {
            connection.close();
        }
    }
}
