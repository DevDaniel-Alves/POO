/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

public class Funcionarios {

    String nome, depart, entBanco, rg;
    double salario;

    public void estadoAtual() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.depart);
        System.out.println("Entrada do Banco: " + this.entBanco);
        System.out.println("RG: " + this.rg);
        System.out.println("Salario: " + salario);
        System.out.println("Salario Anual: " + calculaGanhoAnual());
    }

    public void recebaAumento(double aumento) {
        salario += aumento;
        System.out.println("O funcionario " + nome + " Teve aumento, salario agora de: " + salario);
    }

    public double calculaGanhoAnual() {
        return salario * 12;
    }

    //GATTER 
}
