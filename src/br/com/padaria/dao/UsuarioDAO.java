/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.padaria.dao;

import br.com.padaria.modelo.Usuario;
import br.com.padaria.util.ConnectionFactory;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W
 */
public class UsuarioDAO {

    PreparedStatement pst = null;
    ResultSet rs = null;

    public Usuario verificaUsuario(Usuario usuario) {

        Connection conexao = ConnectionFactory.openConnection();

        try {

            String sql = "select * from usuario where usuario = ? and senha = ?";

            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());

            rs = pst.executeQuery();

            while (rs.next()) {

                Usuario usu = CarregarResultSet(rs);
                return usu;

            }

        } catch (SQLException ex) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            ConnectionFactory.closeConnection();

        }

        return null;

    }

    public Usuario CarregarResultSet(ResultSet rs) throws SQLException {

        Usuario usuario = new Usuario();

        usuario.setId(rs.getLong("id"));
        usuario.setUsuario(rs.getString("usuario"));
        usuario.setSenha(rs.getString("senha"));

        return usuario;

    }

}
