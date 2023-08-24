/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author 07556510140
 */
public class Funcionario {
   
    private double salario;
    private int idade;
    
    
    
    public Funcionario(){
        
    }
    public Funcionario(double salario){
        this.salario = salario;
        imprime();
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void imprime(){
        System.out.println("Salario: R$" + getSalario());
    }
    
}
