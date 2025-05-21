/*

print this star pattern

*
* *
* * *
* * * *
* * * * *

*/

import java.util.*;
public class Pattern1 {

    
    public static void main(String[] args) {

        System.out.println("Enter a number here : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
         
        for(int row = 0; row < number; row++  ){
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
