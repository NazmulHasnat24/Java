import java.util.Scanner;

public class prime {

    
    public static void main(String[] args) {

        System.out.println("Enter how many numbers you want to take input : ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i < num ; i++){

            System.out.print("Enter number to check prime or not : ");
            int input = scan.nextInt();

            int count = 0;

            for(int div = 1; div <= input; div++){

                if(input % div == 0){

                    count++;
                }

            }

            if(count == 2){
                System.out.println(input + " is Prime");
            }
            else{
                System.out.println(input + " is Not Prime");
            }

        }
        
    }
}
