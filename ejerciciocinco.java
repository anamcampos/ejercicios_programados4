//Solicitar al usuario un número N, y mostrar todos los números del 1 al N

import java.util.Scanner;

public class ejerciciocinco{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("Ingrese un numero N");
        int n = input.nextInt();
        while (n<=0){
            System.out.println("Ingrese un numero N positivo mayor a ");
         n = input.nextInt();
        }
        System.out.println("Mostrando todos los numeros de 1 a N ");
       for (int i=1;i<=n;i++){
        System.out.print(i+"||");
       }
      }
}