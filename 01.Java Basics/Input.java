import java.util.*;
public class Input {
    
public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("Enter a number here : ");

int num1 = Integer.parseInt(scan.nextLine());// eita evabe likhle int ar string duitai input neya jai ar print kora jai

System.out.println("Printin the numbers : ");

for(int i = 0; i <= num1; i++){

    System.out.println(i);

}

System.out.println("Enter a neme here : ");

String name = scan.nextLine();// duita tei scan use korate name ta print hocche na ar ei problem sudhu string ar int ei hoi

System.out.println("My name is : " + name);
}

}
