/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaboc_Classes;

/**
 * @author eeuar
 */
public class Administrador extends Funcionario { 
    
    private String senha;
    
    public Administrador(String nomeFuncionario, String cpfFuncionario, String enderecoFuncionario, String telefoneFuncionario, String cargoFuncionario, String senha) {
        super(nomeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, cargoFuncionario);
        this.senha = senha;
        
    }
    
    public Administrador(String nomeAdministrador, String cpfAdministrador, String cargoAdministrador, String senha){
        super(nomeAdministrador,cpfAdministrador, cargoAdministrador);
        this.senha = senha;
    }
    
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
