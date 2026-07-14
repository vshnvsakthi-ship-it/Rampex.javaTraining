package day10.hometask;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int original =  num ;
        int sum  = 0;
        while(num>0){
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num /10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }

    }
}