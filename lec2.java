// input output 
import java.util.*;     //pacakge

class lec2{
    public static void main(String args[]){
        // System.out.print("Hello,World!\n");                     //print
        // System.out.print("Hello World ");
        // System.out.print("with Java \n");                       //  \n new line escape sequence
        // System.out.println("Hello World with java");            // println print next in new line
        // System.out.print("Hello,World! \nFrom Naruto Uzamaki \n");
        // System.out.print("Hello,World!\n");
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");
        // System.out.println("*\n**\n***\n****\n*****");

        // Variables

        // String name = "tony Stark";
        // String Hokage = "Naruto Uzamaki";
        // int a = 25;
        // int b = 10;
        // Double marks = 86.80;
        // Double price = 25.25;

        // b = 15;
        // name = "Iron man ";

        // Data Types

            // Java is typed langauge 
            // it means we have to define the type of before declearing the variable

        //                         Data Types 
        //                             |
        // |-----------------------------------------------------------------|
        // Primitive                                                   Non- Primitive
            
// 8 bits   // Byte        1 Byte                                            String
            // short                                                         Array
            // Char        2 byte                                            class
            // Boolean     1 Byte                                            object
            // int         4 byte                                            interface
            // long        8 byte
            // float       4 byte
            // Double      8 byte

    //  int a = 10;
    //  int b = 25;
    //  int sum = a+b;
    //  System.out.println("The addition is "+ sum);
    //  int diff = b-a;
    //  System.out.println(diff);
    //  int mul = a*b;
    //  System.out.println(mul);
    //  int div = a/b;
    //  System.out.println(div);
    //  a = 25;
    //  b = 10;
    //  double di = a/b;
    //  System.out.println("the division is  " + di);
    //  int rem = a%b;
    //  System.out.println("The rem is  "+ rem);
    //  double re = a%b;
    //  System.out.println(re);
     
    //  double c = 25;
    //  double d = 10;
    //  double divi = c/d;
    //  System.out.println("the division is  " + divi);
    //  double reme = c%d;
    //  System.out.println(reme);
     
    // Java does not follow BODMAS It follows its opretors priority
    // *, /, %     >    +,- 
    // int a = 10;
    // int b= 5;
    // int ans = (a*b)/(a-b);
    // System.out.println(ans);

    // Input

    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println(name);
    // String name1 = sc.nextLine();
    // NextBytes
    // nextInt
    // nextFloat
    // System.out.println(name1);

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("The Addition is  "+ sum);
    sc.close();

    }
}