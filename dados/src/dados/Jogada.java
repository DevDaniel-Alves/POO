/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author 07556510140
 */
public class Jogada {

    private int[] res = new int[3];

    private int lancardado() {
        int num = (int) (Math.random() * 6 + 1);
        return num;
    }

    public void sortear() {
        for (int i = 0; i < 3; i++) {
            res[i] = lancardado();
        }
    }

    public void resultado() {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += res[i];
            System.out.println(res[i]);
        }
        System.out.println("Total: " + total);
        
    }
}