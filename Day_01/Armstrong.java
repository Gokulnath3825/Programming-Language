
import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int original = n;

        int digit = 0;
        int sum = 0;

        while(temp>0){
            digit++;
            temp/=10;
        }

        temp = n;
        while(temp>0){
            int rem = temp%10;
            sum += (int) Math.pow(rem,digit);
            temp/=10;
        }

        if(original == sum)   System.out.println("ArmStrong");
        else   System.out.println("Not a ArmStrong");
        



    }
}
