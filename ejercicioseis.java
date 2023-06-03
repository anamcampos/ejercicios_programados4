/* Solicitar al usuario 10 salarios. Mostrar su suma y cuantos hay mayores de
10000 colones.*/

import java.util.Scanner;

public class ejercicioseis{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        int suma = 0;
        int mayores = 0;
        for (int i=0;i<10;i++){
            System.out.println("Ingrese un salario");
            int salario = input.nextInt();
            while (salario<=0){
                System.out.println("Ingrese un salario válido");
                salario = input.nextInt();
                i = i-1;
            }
                suma += salario;
                if (salario>=10000){
                 mayores += 1;
                }
        }
        System.out.println("La suma de los salarios es: "+suma+ " de los cuales "+ mayores +" son mayores a 10000.");
      }
}