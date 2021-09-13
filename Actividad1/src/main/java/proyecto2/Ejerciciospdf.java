/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Aass
 */
public class Ejerciciospdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio numero 1 PDF
        int N = 5;
        double A = 4.56;
        char C = 'a';
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
        System.out.println("");
        //Ejercicio2
        int NUMERO1 = 12;
        int NUMERO2 = 2;
        double DIVISION;
        int SUMA, RESTA, MULTIPLICACION;
        double MODULO;
        double OPERACION;
        
        OPERACION = 9/3*5-3+8*2;
        System.out.println("El resultado de la operacion es: "+OPERACION);
        
        DIVISION = NUMERO1 /NUMERO2;
        System.out.println("El resultado de la division es: "+DIVISION);
        
        SUMA = NUMERO1 + NUMERO2;
        System.out.println("El resultaod de la suma es: "+SUMA);
        
        RESTA = NUMERO1 - NUMERO2;
        System.out.println("El resultaod de la resta es: "+RESTA);
        
        MULTIPLICACION = NUMERO1 * NUMERO2;
        System.out.println("El resultaod de la multiplicacion es: "+MULTIPLICACION);
        
        MODULO = NUMERO1 % NUMERO2;
        System.out.println("El resultaod del modulo es: "+MODULO);
    }
    
}
