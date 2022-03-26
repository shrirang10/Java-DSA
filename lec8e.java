
import java.util.Scanner;

public class lec8e {
    public static double calculateAverage(int a, int b, int c){
        int sum = a+b+c;
        double average = sum/3;
        return average;
    }
    public static int sumOfOddNumbers(int n){
        int sum = 0; 
        for(int i =0; i<=n; i++){
            if (i%2!=0){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static int findGreaterNumber(int a, int b){
        int c=0;
        if(a<b){
            c=b;
            return c;
        }else{
            c = a;
            return c;
        }
    }
    public static double calculateCircumference(double radius){
        double circumference = 2*3.14*radius;
        return circumference;
    }
    public static String voteEligible(int age){
        if(age<18){
            return "You are not eligible for vote";
        }else{
            return "You Are eligible for vote ";
        }
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        // 1. Enter 3 numbers from the user & make a function to print their average.

        // System.out.println("Enter Any Three Numbers");
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();

        // System.out.println("The average of entered numbers is "+ calculateAverage(a, b, c));
        // System.out.println();

        // 2. Write a function to print the sum of all odd numbers from 1 to n.

        // System.out.println("Enter the number for all odd number sum upto entered number ");
        // int n = sc.nextInt();
        // int sum = sumOfOddNumbers(n);
        // System.out.println("The sum of all odd numbers from 1 to n is "+ sum);
        // System.out.println();

        // 3. Write a function which takes in 2 numbers and returns the greater of those two.

        // System.out.println("Enter any two numbers for finding greater number");
        // int d = sc.nextInt();
        // int e = sc.nextInt();
        // int f = findGreaterNumber(d,e);
        // System.out.println("The Greater Number is "+f);
        // System.out.println();

        // 4. Write a function that takes in the radius as input and returns the circumference of a circle.

        // System.out.println("Enter the radius of circle");
        // double radius = sc.nextDouble();
        // double circumference = calculateCircumference(radius);
        // System.out.println("The circumference of a circle is " + circumference);
        // System.out.println();

        // 5. Write a function that takes in age as input and returns if that person is eligible to vote or not.
        // A person of age > 18 is eligible to vote.

        // System.out.println("Enter Your age");
        // int age = sc.nextInt();
        // String eligible  = voteEligible(age);
        // System.out.println(eligible);
        // System.out.println();
        
        // 6. Write an infinite loop using do while condition.

        // int g = 0;
        // do
        // {
        //     System.out.println("Hello, this is infinite loop\n");
        // }while(g<=0/1);

        // 7. Write a program to enter the numbers till the user wants and at the end it should 
        // display the count of positive, negative and zeros entered.

        // int positive = 0, negative = 0, zeros = 0;
        // System.out.println("Press 1 to continue & 0 to stop");
        // int input = sc.nextInt();
        // while(input == 1) {
        //     System.out.println("Enter your number : ");
        //     int number = sc.nextInt();
        //     if(number > 0) {
        //     positive++;
        //     } else if(number < 0) {
        //     negative++;
        //     } else {
        //     zeros++;
        //     }
        //     System.out.println("Press 1 to continue & 0 to stop");
        //     input = sc.nextInt();
        //     }
        //     System.out.println("Positives : "+ positive);
        //     System.out.println("Negatives : "+ negative);
        //     System.out.println("Zeros : "+ zeros);

        //8. Two numbers are entered by the user, x and n. Write a function to find
        //the value of one number raised to the power of another i.e.x^n

        // System.out.println("Enter x");
        // int x = sc.nextInt();
        // System.out.println("Enter n");
        // int n = sc.nextInt();
        // int result = 1;
        // //Please see that n is not too large or else result will exceed the size of int
        // for(int i=0; i<n; i++) {
        // result = result * x;
        // }
        // System.out.println("x to the power n is : "+ result);

        // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // while(n1 != n2) {
        // if(n1>n2) {
        // n1 = n1 - n2;
        // } else {
        // n2 = n2 - n1;
        // }
        // }
        // System.out.println("GCD is : "+ n2);

        // 10. Write a program to print Fibonacci series of n terms where n is input
        // by user : 0 1 1 2 3 5 8 13 21 .....
        // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.(BONUS)

        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" ");
        if(n > 1) {
        //find nth term
        for(int i=2; i<=n; i++) {
        System.out.print(b+" ");
        //the concept below is called swapping
        int temp = b;
        b = a + b;
        a = temp;
        }
        System.out.println();
        }
        sc.close();
    }
}
