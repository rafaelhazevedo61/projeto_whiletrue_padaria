/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.padaria.testes;

import java.sql.Connection;
import br.com.padaria.util.ConnectionFactory;

/**
 *
 * @author Rafael
 */
public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao = ConnectionFactory.openConnection();

        if (conexao != null) {

            System.out.println("\nConectado!\n");

        } else {

            System.out.println("\nNão conectado!!\n");
        }

        ConnectionFactory.closeConnection();

    }
}
