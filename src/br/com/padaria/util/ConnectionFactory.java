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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class ConnectionFactory {

    private static Connection connection;
    
    //CONEXAO RAFAEL
    private static final String URL_CONNECTION = "jdbc:mysql://localhost:3306/padaria?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    //CONEXAO ADRIEL
//    private static final String URL_CONNECTION = "jdbc:mysql://localhost:3306/Padaria?useTimezone=true&serverTimezone=UTC";
//    private static final String USER = "root";
//    private static final String PASSWORD = "postgres";
//    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection openConnection() {

        if (connection == null) {

            try {

                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);

                System.out.println("Connection opened!");

            } catch (SQLException | ClassNotFoundException ex) {
            
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

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
                
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }



}

