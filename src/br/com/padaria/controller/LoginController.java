package br.com.padaria.controller;

import br.com.padaria.dao.UsuarioDAO;
import br.com.padaria.modelo.Usuario;
import br.com.padaria.view.MenuPrincipal;
import br.com.padaria.view.ViewLogin;
import javax.swing.JOptionPane;

public class LoginController {

    private final ViewLogin view;

    public LoginController(ViewLogin view) {
        this.view = view;
    }

    public void autenticaUsuario() {

        //variáveis
        String usuarionome;
        String senha;

        //recuperando valores da view
        usuarionome = view.getTf_usuário().getText();
        senha = view.getTf_Senha().getText();

        //instanciando uma variavel do tipo usuario
        Usuario usuario = new Usuario(usuarionome, senha);

        //instanciando uma variavel do tipo usuarioDAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //instanciando uma variavel do tipo usuario
        //armazenando o retorno de um método em uma variável específica
        Usuario existeUsuario = usuarioDAO.verificaUsuario(usuario);

        System.out.println(existeUsuario);
        
        if (existeUsuario != null) {
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            view.dispose();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta !!");
            
        }

    }
}
