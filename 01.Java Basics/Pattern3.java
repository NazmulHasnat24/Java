
/*

print this star pattern

      *
    * *
   * * *
 * * * *
* * * * *

*/



import java.util.Scanner;

public class Pattern3 {
    

    public static void main(String[] args) {

        System.out.println("Enter a number here : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
         
        for(int row = 1; row <= number; row++  ){
            
            for(int space = row; space < number; space++){
                
                System.out.print(" ");

            }

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
