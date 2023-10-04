/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.semana6;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosArray {

    public static void ExerciciosArray(int exercicios) {
        switch (exercicios) {
            case 1: Exercicio01();
                break;
            default:
                System.out.println("Exercicio não encontrado");
        }
    }

    public static void Exercicio01() {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[5];
        double media = 0;
        
        for (int i = 0; i < 5; i++) {
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
        
        media /= notas.length; 
        Arrays.sort(notas);
        
        System.out.println(Arrays.toString(notas));
        System.out.println("Media Aritmertica: " + media);
        
    }

}
