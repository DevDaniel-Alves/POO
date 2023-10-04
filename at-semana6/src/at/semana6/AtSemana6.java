/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package at.semana6;

import java.util.Scanner;

/**
 *
 * @author 07556510140
 */
public class AtSemana6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual atividades?");
        int exercicios = sc.nextInt();
        ExerciciosArray.ExerciciosArray(exercicios);
    }
    
}
