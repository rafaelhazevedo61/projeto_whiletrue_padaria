/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.padaria.modelo;

import java.util.Date;

/**
 *
 * @author W
 */
public class Cliente {
    
    
    //variáveis
    private int id;
    private String nome;
    private String senha;
    private String CPF;
    private String RG;
    private String sexo;
    private Date nascimento;
    private String email;
    private String telefone;
    private String CEP;
    private String endereço;

    
    //construtoores
    public Cliente(int id, String nome, String senha, String CPF, String RG, String sexo, Date nascimento, String email, String telefone, String CEP, String endereço) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
        this.RG = RG;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
        this.CEP = CEP;
        this.endereço = endereço;
    }

    public Cliente(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    
    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    
    
    
    
    //tostring
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", CPF=" + CPF + ", RG=" + RG + ", sexo=" + sexo + ", nascimento=" + nascimento + ", email=" + email + ", telefone=" + telefone + ", CEP=" + CEP + ", endere\u00e7o=" + endereço + '}';
    }
    
    
    
    
    
}
