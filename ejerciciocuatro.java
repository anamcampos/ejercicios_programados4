/*Solicitar al usuario todos los números del 100 al 0 de 7 en 7. */

import java.util.Scanner;

public class ejerciciocuatro{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        
       for (int i=100;i>=0;i-=7){
        System.out.println("Ingrese un numero que vaya de 100 a 0 pero de 7 en 7 ");
        int num = input.nextInt();
        while(num<0){
            System.out.println("El número debe ser positivo, ingrese nuevamente.");
         num = input.nextInt();
            i +=7;
        }
        if (num!=i){
            System.out.println("Número incorrecto, intente de nuevo");
            i+=7;
        }
           }
      }
}