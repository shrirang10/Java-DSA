// loops
// for
// while
// do while
import java.util.*;
public class lec4 {
    public static void main (String args[]){
        // for ( int counter = 0; counter<100;++counter){
        //     System.out.println("Hello Naruto");
        // }

        // for (int counter = 0; counter<11;counter++){
        //     System.out.println(counter);
        // }

        // int i =0;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<10);

        // int i =12;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 12;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<10);

        // sum of natural numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum=0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);

        // int n = sc.nextInt();
        // for(int i = 1; i<11; i++){
        //     int t = n*i;
        //     System.out.println(t);
        // }
        sc.close();
    }
}
