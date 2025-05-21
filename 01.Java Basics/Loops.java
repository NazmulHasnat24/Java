import java.util.Scanner;
public class Loops {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        System.out.println("Enter a number here : ");

        int num1 = Integer.parseInt(scan.nextLine());
         
        System.out.println("Printing using for loop :");

        for(int i = 0; i < num1; i++){

            System.out.print(i + " ");

        }

        System.out.println();

        System.out.println("Printing using while loop :");
        while(counter < num1){

            System.out.print(counter + " ");

            counter++;
        }

    }
}
