public class Grading_System {
    

    public static void main(String[] args) {
        
        int grade = 55;

        if(grade > 90){

            System.out.println("Excellent Result");

        }
        else if(grade > 80 && grade <= 90){

            System.out.println("Good Result");

        }
        else if(grade > 70 && grade <= 80){

            System.out.println("Fair Result");

        }
        else if(grade > 60 && grade <= 70){

            System.out.println("Meet Expectation Result");

        }
        else {

            System.out.println("Below Expectation Result");

        }
    }
}
