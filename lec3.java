// Conditional Statements
import java.util.*;
public class lec3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age> 18){
        //     System.out.println("Adult");
        // }else {
        //     System.out.println("Not Adult");
        // }
        // int number = sc.nextInt();
        // if(number%2==0){
        //     System.out.println("Entered Number is even ");
        // }else{
        //     System.out.println("Entered Number is odd ");
        // }
        // int a = sc.nextInt();
        // int b= sc.nextInt();
        // if (a==b){
        //     System.out.println("The Numbers are equal");
        // }else if (a>b){
        //     System.out.println("a is greater than b");
        // }else {
        //     System.out.println("b is greater than a ");
        // }
        int button = sc.nextInt();
        // if (button == 1){
        //     System.out.println("hello");
        // }else if (button==2){
        //     System.out.println("namaste");
        // }else if (button ==3 ){
        //     System.out.println("Bonjour");
        // }else {
        //     System.out.println("invalid");
        // }
        switch(button)
        {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 :System.out.println("bonjour");
            break;
            default: System.out.println("invalid");
        }
        sc.close();
    }
}
