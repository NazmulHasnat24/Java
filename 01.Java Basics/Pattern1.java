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
         
        for(int i = 0; i < number; i++  ){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
