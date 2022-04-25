
package br.com.padaria.controller;

import br.com.padaria.view.CadastroUsuario;


public class CadastroUsuarioController {
    private final CadastroUsuario view;

    public CadastroUsuarioController(CadastroUsuario view) {
        this.view = view;
    }
    
    public void cadsatrarUsuario(){
        String nome = view.getNome().getText();
        String usuario = view.getUsuario().getText();
        String senha = view.getSenha().getText();
        String cpfs = view.getCpf().getText();
        
    }
    
}
