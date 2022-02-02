/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoscoordenados;

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class PuntosCoordenados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int CantPuntos,cantprimer=0,cantsegundo=0,canttercero=0,cantcuarto=0;
        float x,y;
        
        System.out.print("Escriba la cantidad de puntos coordenados que ingresara: ");
        CantPuntos = teclado.nextInt();
        
        for(int i=0 ; i<CantPuntos;i++){
            System.out.print("\nIngrese el punto : "+(i+1)+" \n");
            System.out.print("Ingrese el valor de x: \n");
            x=teclado.nextFloat();
            System.out.print("Ingrese el valor de y: \n");
            y=teclado.nextFloat();
            if(x>0){
                if(y>0){
                    cantprimer+=1;
                }
                else{
                    cantcuarto+=1;
                }
            }
            else{
                if(y>0){
                    cantsegundo+=1;
                }
                else{
                    canttercero+=1;
                }
            }
        }
        
        System.out.print("\nCantidad de puntos en el primer cuadrante: "+cantprimer);
        System.out.print("\nCantidad de puntos en el segundo cuadrante: "+cantsegundo);
        System.out.print("\nCantidad de puntos en el tercer cuadrante: "+canttercero);
        System.out.print("\nCantidad de puntos en el cuarto cuadrante: "+cantcuarto+"\n");



    }
    
}
