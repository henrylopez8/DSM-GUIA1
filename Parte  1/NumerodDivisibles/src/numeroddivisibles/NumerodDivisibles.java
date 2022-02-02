/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroddivisibles;

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class NumerodDivisibles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    float num1, num2, resultado;
    System.out.print("Ingrese el primer número: ");
    num1= teclado.nextFloat();
    System.out.print("Ingrese el segundo número: ");
    num2=teclado.nextFloat();

    resultado=num2%num1;

    if(resultado==0){

      System.out.println("El número: "+ num1+ " es divisible con " + num2);

    }
     else{

      System.out.println("El número: "+ num1+ " no es divisible con " + num2);
    }
    
}
}
