/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalumnos;

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       
        float notas;
        int cant1=0, cant2=0;
       
        
        for(int i=0;i<=9;i++){
            do{
            System.out.print("Escriba la nota del alumno " +(i+1)+": \n");
            notas=teclado.nextFloat();
            }while(notas<0 || notas>10);
            if(notas>=7){
                cant1+=1;
            }
            else if( notas<7){
                cant2+=1;
            }
        }
        System.out.print("\n");
        System.out.print(cant1+" alumnos con nota mayor o igual a 7\n");
        System.out.print(cant2+" alumnos con nota menor a 7\n");

        
        
        
        
    }
    
}
