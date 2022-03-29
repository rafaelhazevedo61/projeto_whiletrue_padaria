
package br.com.padaria.controller;
import br.com.padaria.dao.UsuarioDAO;
import br.com.padaria.modelo.Usuario;
import br.com.padaria.view.MenuPrincipal;
import br.com.padaria.view.ViewLogin;
import javax.swing.JOptionPane;

public class LoginController {
    //variáveis
    private String usuarionome;
    private String senha;
    private final ViewLogin view ;
   
    
    public LoginController(ViewLogin view) {
        this.view = view;
    }
    
    
    public void autenticaUsuario(){
       
        
       usuarionome = view.getTf_usuário().getText();
       senha = view.getTf_Senha().getText();
       
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuario = new Usuario(usuarionome, senha);       
       Usuario existeUsuario = usuarioDAO.verificaUsuario(usuario);
        System.out.println(existeUsuario);
       if(existeUsuario != null ){
          MenuPrincipal menuPrincipal = new MenuPrincipal();
          menuPrincipal.setVisible(true);
        }else{
           JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta !!");
       }  
       
    } 
}
