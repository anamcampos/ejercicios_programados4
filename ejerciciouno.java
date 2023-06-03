/*Solicitar al usuario un número y mostrar su cuadrado, repetir el proceso hasta
que se introduzca un número negativo. */


import java.util.Scanner;

public class ejerciciouno{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int num = 1;
        while (num>0){
            System.out.println("Ingrese un numero positivo mayor a 0");
            num = input.nextInt();
            if (num>0){
                System.out.println("El cuadrado del numero es "+num*num);
            } 
        }
      }
}