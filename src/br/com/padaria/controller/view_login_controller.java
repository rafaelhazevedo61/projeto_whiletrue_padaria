
package br.com.padaria.controller;
import br.com.padaria.view.View_Autenticar_Usuario;

public class view_login_controller {
    //variáveis
    private String nome;
    private String senha;
    private View_Autenticar_Usuario view ;

    public view_login_controller(View_Autenticar_Usuario view) {
        this.view = view;
    }
    
    
    public void autenticaUsuario(){
        
       nome = view.getTf_usuário().getText();
       senha = view.getTf_Senha().getText();
       
       
        
        
    }
    
    
    
    
}
