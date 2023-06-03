/*Solictar al usuario números hasta que se teclee uno negativo, y mostrar cuántos
números se han introducido.*/

import java.util.Scanner;

public class ejerciciodos{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int num = 1;
        int suma = 0;
        while (num>0){
            System.out.println("Ingrese un numero positivo mayor a 0");
            num = input.nextInt();
            if (num>0){
                suma += 1;
            }
        }
        System.out.println("Se ingresaron: "+suma+ " numeros.");
      }
}