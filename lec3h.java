import java.util.Scanner;

public class lec3h {
    public static void main(String args[]){
//        1. Make a Calculator. Take 2 numbers (a & b) from the user and an
//           operation as follows :
//           1 : + (Addition) a + b
//           ● 2 : - (Subtraction) a - b
//           ● 3 : * (Multiplication) a * b
//           ● 4 : / (Division) a / b
//           ● 5 : % (Modulo or remainder) a % b
//           Calculate the result according to the operation given and
//           display it to the user.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Number");
            double a = sc.nextDouble();
            System.out.println("Enter the Second Number");
            double b  = sc.nextDouble();
            System.out.println("Enter 1 for addition 2 for subtraction 3 for multiplication 4 for division 5 for modulo");
            int input = sc.nextInt();
            switch (input){
                case 1 : System.out.println(a+b);
                            
                break;

                case 2 : System.out.println(a-b);
                           
                break;

                case 3 : System.out.println(a*b);
                             
                break;

                case 4 :  System.out.println(a/b);
                         
                break;

                case 5 :System.out.println(a%b);
                          
                break;

                default : System.out.println("Invalid input");
            }
            

//          2. Ask the user to enter the number of the month & print the name
//          of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ &
//          so on.







            sc.close();
    }
}
