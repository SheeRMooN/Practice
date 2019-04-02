package ru.Voronuyk.DB;

import java.sql.*;

public class Jdbc2 {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb_test" +
            "?verifyServerCertificate=false" +
            "&useSSL=false" +
            "&requireSSL=false" +
            "&useLegacyDatetimeCode=false" +
            "&amp" +
            "&serverTimezone=UTC";

    private static final String NAME = "root";
    private static final String PASSWORD = "root";


    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Не взлетело :0 , драйвер jdbc");
        }


        try (Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD); Statement statement = connection.createStatement()) {
            System.out.println(!connection.isClosed());
            //универсальная команда вставка и селект.
            //statement.execute("INSERT INTO animals(anim_name,anim_desc) VALUES ('name','desc');");

            //тока обновление
            //int res =statement.executeUpdate("UPDATE animals SET anin_name='New name' WHERE id =1;");
            //System.out.println(res);

            // результ метод.тока  селекты.
            //ResultSet res = statement.executeQuery("SELECT  * FROM animals;");

            //позволяет добовлять пачкой
            //statement.addBatch("insert into  animals(anim_name, anim_desc) values ('batch1','one')");
            //statement.addBatch("insert into  animals(anim_name, anim_desc) values ('batch2','one')");
            //statement.addBatch("insert into  animals(anim_name, anim_desc) values ('batch3','one')");
            // заливает в базу
            //statement.executeBatch();

            //удаляет добавленный батч
            //statement.clearBatch();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
