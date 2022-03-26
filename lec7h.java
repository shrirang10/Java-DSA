public class lec7h {
    public static int sumOfOddNumbers(int n){
        int sum = 0; 
        for(int i =0; i<=n; i++){
            if (i%2!=0){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
       int n = 100;
       int sum = sumOfOddNumbers(n);
       System.out.println(sum);
    }
}
