/*print this star pattern

* * * * *      
  * * * *
    * * *
      * *
        *

*/
import java.util.*;
public class Patter4 {
    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);

         System.out.println("Take input : ");
         int num = scan.nextInt();

         for(int row = 0; row < num; row++){


            for(int space = 0; space < row ; space++ ){
                
                System.out.print(" ");

            }

            for(int col = 0; col < num - row; col++){

                System.out.print("*");

            }
            System.out.println();
         }

    }
}
