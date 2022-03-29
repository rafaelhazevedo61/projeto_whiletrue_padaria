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

        Teste_atualizaUsuarios();
        
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

    public static void Teste_insereUsuarios(){
        String usuario1 = "teste02";
        String senha = "teste02";
        
        Usuario usuario = new Usuario(usuario1, senha);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insereUsuario(usuario);
        
    }
    
    public static void Teste_deletaUsuarios(){
        Long id = 1L;
        
        Usuario usuario = new Usuario(id);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.deletaUsuario(usuario);
    }
    
    public static void Teste_atualizaUsuarios(){
        Long id = 4L;
        
        String usuario1 = "usuario teste 02";
        String senha = "usuario teste 02";
        Usuario usuario = new Usuario(id, usuario1, senha);
        System.out.println(usuario);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.atualizaUsuario(usuario);
           
    }
}
