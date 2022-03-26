import java.util.Scanner;

public class lec2h {
    public static void main(String args[]){
//         1. Try to declare meaningful variables of each type. Eg - a variable
//            named age should be a numeric type (int or float) not byte.
            // int age = 78;
            // double marks  = 86.80;
            // char leter = 'a';
            // String name = "Naruto";
            // int  team_no = 7;
            // System.out.println(age);
            // System.out.println(marks);
            // System.out.println(leter);
            // System.out.println(name);
            // System.out.println(team_no);

//        2. Make a program that takes the radius of a circle as input, calculates
//           its radius and area and prints it as output to the user.
            Scanner sc = new Scanner(System.in);
            // double r = sc.nextDouble();
            // double area = 3.14 *r;
            // System.out.println("The Area of circle is " + area);

//       3. Make a program that prints the table of a number that is input by
//          the user.

            System.out.println("Enter the table you want to print ");
            int table = sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(table*i);
            }
        sc.close();
    }
}
