package proyecto2;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        //Concatenar 
        String cadena = "Hola";
        String nombre1 = "Maria";
        String nombre2 = "Paula";
        String union = nombre1 + " "+ nombre2;
        System.out.println("Union = "+union+".");
        //String  nombre1 =“maría”;
        //String nombre2 =“paula”;
        //String union= nombre1 + “ “ + nombre2;    
        //System.out.println(“union = “ +union); 
        
        //Operadores de asignacion
        int numero1 = 8;
        int numero2 = numero1;
        System.out.println(numero2);
        System.out.println("El valor de la variable numero1 es: "+numero1);
        System.out.println("El valor de la variable numero2 es: "+numero2);
        
        System.out.println("");

        //Operadores arimeticos
        long Numero1 = 8;
        int Numero2 = 13;
        long resta = Numero1 - Numero2;
        System.out.println("El resultado es "+resta);
        
        int NUmero1 = 3;
        int NUmero2 = 52;
        int suma = NUmero1 + NUmero2;
        System.out.println("El resultado de la suma es: "+suma);
        
        double NUMero1 = 7.6;
        int NUMero2 = 4;
        double multiplicacion = NUMero1*NUMero2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        
        float NUMEro1 = 2.3f;
        int NUMEro2 = 5;
        float division = NUMEro1 / NUMEro2;
        System.out.println("El resultado de la division es: "+division);
        System.out.println("");
        //Operadores arimeticos incrementales
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        
        int aa = 5;
        int bb = ++aa;
        System.out.println(aa);
        System.out.println(bb);
        
        int aaa = 5;
        int bbb = aaa--;
        System.out.println(aaa);
        System.out.println(bbb);
        
        int aaaa = 5;
        int bbbb = --aaaa;
        System.out.println(aaaa);
        System.out.println(bbbb);
        System.out.println("");
        //Operadores arimeticos combinados
        int Ae = 5; 
        int B = 2;
        B+= Ae;
        System.out.println(B);
        
        int AA = 5;
        int BB = 2;
        BB-=AA;
        System.out.println(BB);
        
        int AAA = 5;
        int BBB = 2;
        BBB*=AAA;
        System.out.println(BBB);

        int AAAA = 5;
        double BBBB = 2.0;
        BBBB /=AAAA;
        System.out.println(BBBB);
        
        int AAAAA = 5;
        int BBBBB = 2;
        BBBBB %=AAAAA;
        System.out.println(BBBBB);
        
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
