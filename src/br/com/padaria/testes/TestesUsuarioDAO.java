/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.padaria.testes;

import br.com.padaria.dao.UsuarioDAO;
import br.com.padaria.modelo.Usuario;

/**
 *
 * @author Rafael
 */
public class TestesUsuarioDAO {

    public static void main(String[] args) {

        Teste_verificaUsuario();
        
    }

    public static void Teste_verificaUsuario() {

        String usuario = "admin";
        String senha = "admin";

        Usuario usuario1 = new Usuario();
        usuario1.setUsuario(usuario);
        usuario1.setSenha(senha);

        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario2 = dao.verificaUsuario(usuario1);

        if (usuario2 != null) {
            System.out.println("Usuário existe na base de dados!");
        } else {
            System.out.println("Usuário não existe na base de dados!");
        }

    }

}
