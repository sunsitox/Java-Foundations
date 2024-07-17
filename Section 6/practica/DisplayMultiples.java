package practica;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       int num = sc.nextInt(), mult;
       
       
        for (int i = 1; i <= 12; i++) {
            mult = num * i;
            System.out.println(num + "x" + i + "=" + mult);
            
        }
       
    }

}
