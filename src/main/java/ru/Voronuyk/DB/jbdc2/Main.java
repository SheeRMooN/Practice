package ru.Voronuyk.DB.jbdc2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.sql.*;
import java.util.Calendar;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb_test" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";
    private static final String NAME = "root";
    private static final String PASSWORD = "root";

    private static final String INSERT_NEW = "INSERT INTO dish VALUES(?,?,?,?,?,?,?);";


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_NEW);

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Insertet title");
            preparedStatement.setString(3, "Inserted desc");
            preparedStatement.setFloat(4, 0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("aple.jpg"));

            preparedStatement.execute();

        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }

    }
}
