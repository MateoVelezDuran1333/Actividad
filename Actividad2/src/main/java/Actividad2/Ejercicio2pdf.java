/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2;

import java.util.Scanner;

/**
 *
 * @author Aass
 */
//Construir un programa que, dado un número total de horas, devuelve el número
//de semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas
//debe mostrar 5 semanas, 6 días y 16 horas.
public class Ejercicio2pdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Dato, semanas, dias, horas;
        System.out.println("Introduzca el numero de horas: ");
        Dato = entrada.nextInt();
        semanas = Dato /168;
        dias = Dato% 168 / 24;
        horas = Dato %24;
        System.out.println("Semanas : "+ semanas);
        System.out.println("Dias : "+ dias);
        System.out.println("Horas : "+ horas);
    }
    
}
