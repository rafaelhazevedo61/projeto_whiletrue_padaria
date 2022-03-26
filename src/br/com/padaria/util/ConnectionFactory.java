/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.padaria.util;

/**
 *
 * @author W
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;

/**
 *
 * @author Rafael
 */
public class ConnectionFactory {

    private static Connection connection;
    private static final String URL_CONNECTION = "jdbc:mysql://localhost:5432/crud-javaswing";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String DRIVER = "org.postgresql.Driver";

    public static Connection openConnection() {

        if (connection == null) {

            try {

                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);

                System.out.println("Connection opened!");

            } catch (SQLException | ClassNotFoundException ex) {

                printStackTrace(ex);

            }

        }

        return connection;
    }

    public static void closeConnection() {

        if (connection != null) {

            try {

                connection.close();
                connection = null;

                System.out.println("Connection closed!");

            } catch (SQLException ex) {

                printStackTrace(ex);

            }

        }

    }



}

