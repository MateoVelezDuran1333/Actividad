/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad3;
public class Ejercicio1y2  {
    public static void main(String[] args) {
         double ValorPi;
        ValorPi = Math.PI;
         System.out.println(ValorPi);
         double Raiz = Math.sqrt(25);
         System.out.println(Raiz);
         System.out.println("");
         
         //Ejericicio 2
         System.out.println("Valor absoluto = "+ Math.abs(-123));
         System.out.println("Hipotenusa = "+ Math.hypot(15, 9));
         System.out.println("Logaritmo Natural = "+ Math.log(4));
         System.out.println("Numero Mayor = "+Math.max(4, 9));
         System.out.println("Numero menor = "+Math.min(4, 9));
         System.out.println("Potencia = "+ Math.pow(5, 4));
         System.out.println("Numero aleatorio = "+ Math.random()*100);
         System.out.println("Numero Redondeado = "+ Math.round(Math.random()*10));
         System.out.println("Raiz Cuadrada = "+ Math.sqrt(121));
    }
    
}
