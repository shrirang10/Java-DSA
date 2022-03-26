import java.util.Scanner;

public class lec11 {
    public static void main(String args[]) {
        // 2D Array
        // Declaration
        // type[][]array name = new type[row][column];
        // int [][]numbers = new int [3][4];
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        // int[][] numbers = new int [rows][column];
        
        // // input
        // // rows
        // for(int i = 0;i<rows;i++){
        //     // columns
        //     for(int j =0; j<column;j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // // output
        // for(int i = 0;i<rows;i++){
        //     for(int j =0; j<column;j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int [][] numbers = new int [rows][column];

        for(int i = 0 ; i< rows;i++){
            for(int j =0;j<column;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<rows;i++){
            for(int j = 0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        int x =sc.nextInt();

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<column; j++){
                if(x==numbers[i][j]){
                    System.out.println(" X found at "+"("+ i + ","+ j+")");
                }
            }
        }
        sc.close();
    }
}
