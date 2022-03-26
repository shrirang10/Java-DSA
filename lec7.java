import java.util.Scanner;

public class lec7 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static int calculateFactorial(int n){
        // loop 
        if(n<0){
            System.out.println("Invalid Number");
            return 0;
        }
        int factorial = 1;
        for(int i = n;i>=1;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void printFactorials(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i =n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("The factorial by 2nd function of "+ n + " is " + factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // Greetings
        System.out.println("Enter Your Name ");
        String name = sc.next();
        System.out.println("Hello "+ name + "\nHow are you");

        // Addition
        System.out.println("Enter The Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The Sum of two numbers is "+ sum);

        // Multiplication
        System.out.println("The product of two numbers "+a+" and "+b+" is "+calculateProduct(a, b));

        // Factorial 
        System.out.println("Enter The Number for calculating factorial");
        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("The factorial of "+ n + " is " + factorial);

        // factorial with void return
        printFactorials(n);

        sc.close();
    }
}
