package Day6_classtask;

import java.util.Scanner;
class Atm{
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
            if(pin==originalPin){

                System.out.println("Welcome user");

                System.out.print("Enter the amount withdraw: ");
                int amount=sc.nextInt();
                if(amount<=balance){
                    balance=balance-amount;
                    System.out.print("Amount withdraw :" + amount + " " + "Remaining balance" +balance);


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