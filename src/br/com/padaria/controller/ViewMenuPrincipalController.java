/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.padaria.controller;

import br.com.padaria.view.ViewMenuPrincipal;
import br.com.padaria.view.ViewVenda;

public class ViewMenuPrincipalController {

    private final ViewMenuPrincipal view;

    public ViewMenuPrincipalController(ViewMenuPrincipal view) {
        this.view = view;
    }
    
    public void chamarViewVenda(){
        
        ViewVenda tela = new ViewVenda();
        tela.setVisible(true);
        view.getjDesktopPane1().add(tela);
        
    }
    
    

}
