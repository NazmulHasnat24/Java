
/*

print this star patten

*****
****
***
**
*

*/

import java.util.Scanner;

public class Pattern2 {
        public static void main(String[] args) {

        System.out.println("Enter a number here : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
         
        for(int row = 0; row < number; row++  ){
            for(int col = number; col > row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
