/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.padaria.dao;
import br.com.padaria.util.ConnectionFactory;
import java.sql.*;
/**
 *
 * @author W
 */
public class LoginDAO {
    
    ConnectionFactory connection;

    public LoginDAO(ConnectionFactory connection) {
        this.connection = connection;
    }
    
    
    public boolean verificaUsuario(){
        
        String sql = "select from cliente where nome = ? and senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        
        return false;
    }
    
}
