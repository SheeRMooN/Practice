package ru.Voronuyk.DB.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private  final String URL = "jdbc:mysql://localhost:3306/mydb_test" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";
    private  final String NAME = "root";
    private  final String PASSWORD = "root";

    private Connection connection;

    public DBWorker() throws SQLException {
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println(!connection.isClosed());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
