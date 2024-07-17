package practica;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 444_555_123;
        
        System.out.print("Ingrese su pin: ");
        
        while (true) {            
            int pinUsu = sc.nextInt();
            
            if (pinUsu == pin){
                System.out.println("pin verificado, puede ingresar");
                break;
            }
            else {
                System.out.print("Pin incorrecto, Intente otra ves: ");
            }
        }
        
        
    }
}
