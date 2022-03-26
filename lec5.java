// Patterns 

import java.util.*;
public class lec5 {
    public static void main (String args[]){
        // Pattern

        // 1] Solid Rectangle

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of rows");
        // int n = sc.nextInt();
        // System.out.println("Enter the number of Columns");
        // int m = sc.nextInt();

        // outer loop
        // for(int i=1; i<=n;i++){
        //     // inner loop
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2] hollow rectangle

        // for (int i=1;i<=n;i++){
        //     for(int j=1; j<=m;j++){
        //         if(i==1 || j==1|| i==n || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 3] Half Pyramid

        // int p = sc.nextInt();
        // for(int i=0;i<=p;i++){
        //     for(int j=1; j<=i;j++){
        //     System.out.print("*");
        //     }
        // System.out.println();
        // }

        // 4] Intverted half pyramid 

        // int p = sc.nextInt();
        // for(int i=p;i>=1;i--){
        //     for(int j=1; j<=i;j++){
        //     System.out.print("*");
        //     }
        // System.out.println();
        // }

        // 5] Inverted Half Pyramid  rotated by 180 deg

        // int n = sc.nextInt();
        // // outer loop
        // for(int i=1;i<=n;i++){
        //     // inner loop --> space
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop -->star
        //     for(int j= 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 6] Half pyramid with Numbers

        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // 7] Inverted half Pyramid with Numbers

        // int n = sc.nextInt();
        // for(int i=n;i>=1;i--){                     // rows
            //     for(int j=1;j<=i;j++){                 // columns 
                //         System.out.print(j + " ");
                //     }
                //     System.out.println();
                // }
                
        // 7] Inverted half Pyramid with Numbers

        // int n = sc.nextInt();
        // // outer loop
        // for(int i=1;i<=n;i++){                         // rows
        //     // inner loop
        //         for(int j=1;j<=n-i+1;j++){                 // columns 
        //                  System.out.print(j + " ");
        //         }
        //         System.out.println();
        // }

        // 8] Floyd's Traingle

        // int n = sc.nextInt();
        // int number =1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 9] 0-1 Traingle

        int n =sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                // sum = i+j;
                // if(sum%2==0)
                if((i+j)%2==0){                     //even
                    System.out.print(1 + " ");
                }else{                              //odd
                    System.out.print(0 + " ");
                }
            }System.out.println();
        }





        sc.close();
    }
}
