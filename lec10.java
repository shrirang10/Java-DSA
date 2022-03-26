import java.util.*;

public class lec10 {
    public static void main(String[] args) {
        // Defining an Array(1)
        // type[]array name = new type[];

        // int[] marks = new int [3];
        // int marks[] = new int [3];
        // int[] marks = new int [ 20];
        // marks[0] = 97; //phy
        // marks[1] = 98; //chem
        // marks[2] = 95; //eng
        // // System.out.println(marks);
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for(int i = 0; i <3; i++){
        // System.out.println(marks[i]);
        // }

        // Defining an array(2)
        // type[]array name = {1,2,3,4,5,6};

        // int marks[]={97,98,95};
        // for(int j = 0; j <3; j++){
        // System.out.println(marks[j]);
        // }
        // make array with user input

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the numbers");
        // int size =sc.nextInt();
        // int[] numbers = new int[size];
        // // for(int i = 0 ; i<numbers.length;i++)
        // for(int i = 0 ; i<numbers.length;i++){
        // System.out.println(numbers[i]);
        // }
        // String [] name = new String [size];
        // for(int i = 0 ; i<numbers.length;i++){
        // System.out.println(name[i]);
        // }
        // Double [] a = new Double [size];
        // for(int i = 0 ; i<numbers.length;i++){
        // System.out.println(a[i]);
        // }
        // Boolean [] booleans = new Boolean [size];
        // for(int i = 0 ; i<numbers.length;i++){
        // System.out.println(booleans[i]);
        // }

        // take the array element input from the user
        System.out.println("Enter the Size of an array ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the Number you want find in an array ");
        int x = sc.nextInt();
        // System.out.println("The Array is ");
        for (int i = 0; i < numbers.length; i++) {
            if(x==numbers[i]){
                System.out.println("The x found at index : "+ i);
            }
            // System.out.println(numbers[i] + " ");
        }

        sc.close();
    }
}
