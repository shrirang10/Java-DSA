import java.util.Scanner;

public class lec6 {
    public static void main(String args[]) {
        // 10] Butterfly pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n =5;

        // // upper half
        // for(int i=1;i<=n;i++){

        // // 1st part
        // for(int j =1; j<=i;j++){
        // System.out.print("*");
        // }

        // // spaces
        // int spaces = 2 * (n-i);
        // for(int j=1;j<=spaces;j++){
        // System.out.print(" ");
        // }

        // // 2nd part
        // for(int j =1; j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // lower half
        // for(int i=n;i>=1;i--){

        // // 1st part
        // for(int j =1; j<=i;j++){
        // System.out.print("*");
        // }

        // // spaces
        // int spaces = 2 * (n-i);
        // for(int j=1;j<=spaces;j++){
        // System.out.print(" ");
        // }

        // // 2nd part
        // for(int j =1; j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Solid rhombus

        // int n = 5;
        // for(int i=1;i<=n;i++){
        // for(int j=1; j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for(int j = 1; j<=n;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Hollow Solid rhombus

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // if (i == 1 || i == n)
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // else {
        // for (int j = 1; j <= n; j++) {
        // if (j == 1 || j == n) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // Number pyramid
        // for(int i =1;i<=n;i++){
        // for(int j=1 ;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // palindromic pattern
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     // 1st half
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     // 2nd half
        //     for(int j =2; j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Diamond Pattern

        // upper half
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for(int i=n;i>=1;i--){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
