/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

/**
 *
 * @author 07556510140
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios();
        f1.nome = "Daniel";
        f1.depart = "Estoquista";
        f1.entBanco = "12/06/2016";
        f1.rg = "25252525";
        f1.salario = 1500;
        f1.recebaAumento(500);
        
        f1.estadoAtual();
    }

}
