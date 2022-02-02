/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosparesimpares;

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class NumerosParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad,nums,numpares=0,numimpares=0 ;
     
        
        System.out.print("¿Cuantos números ingresará?\n");
        cantidad=teclado.nextInt();
        
        for(int i=0;i<cantidad;i++){
            System.out.print("Escriba el número "+ (i+1) +": \n");
            nums= teclado.nextInt();
            
            if(nums%2==0){
                numpares+=1;
            }
            else{
                numimpares+=1;
            }
    }
        System.out.print("\nLa cantidad de números pares es: "+numpares);
        System.out.print("\nLa cantidad de números impares es: "+numimpares + " \n");

    }
    
}
