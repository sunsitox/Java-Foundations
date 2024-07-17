package practica;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        /*
         for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        for (int i = 0; i < height; i++) {
            
            for (int j = 0; j < width; j++) {
                 
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("#");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        for (int i = 0; i <= leg; i++) {
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == leg) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            
        }
        
        
        
    }
}
