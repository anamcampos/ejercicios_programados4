/*Solicitar al usuario un número para adivinar. Para ello pedir un número N, y
luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
con respecto a N. El proceso termina cuando el usuario acierta */

import java.util.Scanner;

public class ejerciciotres{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("Ingrese un numero");
       int num = input.nextInt();
       System.out.println("Ingrese un numero para adivinar");
       int adivino = input.nextInt();
        while (num!=adivino){
            if (num>adivino){
                System.out.println("Mayor");
            } else{
                System.out.println("Menor");
            } 
            System.out.println("Ingrese otro numero para adivinar");
            adivino = input.nextInt();
        }
        System.out.println("Felicidades, ha adivinado correctamente.");
      }
}

