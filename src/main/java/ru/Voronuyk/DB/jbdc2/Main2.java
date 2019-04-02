package ru.Voronuyk.DB.jbdc2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class Main2 {
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
    private static final String GET_ALL = "SELECT * FROM dish;";


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            preparedStatement = connection.prepareStatement(GET_ALL);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String desc = resultSet.getString("description");
                float rating = resultSet.getFloat("rating");
                boolean published = resultSet.getBoolean("published");
                Date date = resultSet.getDate("created");
                byte[] icon = resultSet.getBytes("icon");

                System.out.println("id: "+id+ ", title: "+title+ ", description: "+desc+ ", rating: "+rating+ ", published: "+published+ ", created: "+date+ ", icon lenght: "+icon.length);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }

    }
}