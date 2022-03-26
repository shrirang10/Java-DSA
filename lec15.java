import java.util.Scanner;

public class lec15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bit Manipulation
        // left shift operator <<
        // right shift operator >>

        // Operations
        // 1] get
        // 2] set
        // 3] clear
        // 4] update

        // get operation

        // int n = 5; //0101
        // int pos = 2;
        // int bitmask = 1<<pos;

        // if ((bitmask & n) == 0){
        // System.out.println("bit was zero");
        // }else{
        // System.out.println("bit was one");
        // }

        // set operation

        // int n = 5;
        // int pos = 1;
        // int bitmask = 1<<pos;

        // int newNumber = bitmask | n;
        // System.out.println(newNumber);

        // clear operation

        // int n =5;
        // int pos = 2;
        // int bitmask = 1<<pos;
        // int notBitmask = ~(bitmask);

        // int newNumber = notBitmask & n;
        // System.out.println(newNumber);

        // update operation

        int oper = sc.nextInt();

        // oper = 1 : set & oper=0 : clear
        // updat bit to 1 else update bit to 0

        int n = 5; // 0101 -> 0111 ->dec 7
        int pos = 1;
        int bitmask = 1 << pos;

        if (oper == 1) {
            // set

            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else {
            // clear

            int notBitmask = ~(bitmask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
