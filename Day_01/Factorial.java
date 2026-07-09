
import java.util.Scanner;

public class Factorial {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 1;

        while(n>0){
            sum*=(long)n;
            n--;
        }

        System.out.println(sum);

    }
}
