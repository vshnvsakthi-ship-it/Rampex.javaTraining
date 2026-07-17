package Day4.Hometask;

import java.util.Scanner;
public class Atm{
    public static void main(String[] args){
        System.out.print("Insert your card :");
        String cardInfo="card";
        int originalPin=1234;
        int balance=10000;
        Scanner sc=new Scanner(System.in);
        String cardDetails=sc.nextLine();
        if(cardDetails.equals(cardInfo)){
            System.out.print("Enter your pin :");
            int pin=sc.nextInt();
            if(pin<1000 || pin>9999){
                System.out.println("Invalid pin");
                return;
            }
            if(pin==originalPin){
                System.out.println("Welcome user");

                System.out.print("Enter the amount withdraw: ");
                int amount=sc.nextInt();
                if(amount<0){
                    System.out.println("Invalid Amount");
                    return;
                }
                if(amount<=balance){
                    balance=balance-amount;
                    System.out.print("Amount withdraw :" + amount + " | Remaining balance :" + balance);
                }
                else{
                    System.out.print("Insuficient Fund");
                }
            }
            else{
                System.out.print("Wrong pin");
            }
        }
        else{
            System.out.print("Invalid card");
        }

    }

}