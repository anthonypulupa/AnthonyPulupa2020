/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.anthonypulupa2020;

import java.util.Scanner;

/**
 *
 * @author anthony
 */
public class AnthonyPulupa2020 {

    public static void main(String[] args) {
        
     float[] Dias = new float[7];
     float Lunes = 1;
     float Martes = 2;
     float Miercoles = 3;
     float Jueves = 4;
     float Viernes = 5;
     float Sabado = 6;
     float Domingo = 7;
     
     Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese los Dias de la semana: ");
            Dias [i] = sc.nextFloat();
        }
    System.out.println("----ingrese una opcion del 1 al 7----");
    System.out.println("");
    System.out.println("");
    
    }
}
