package Day13.classtask;

import java.util.Scanner;


class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");

        try{
            int a=sc.nextInt();
            System.out.println(a*a);
        }
        catch(Exception e){

        }
//        int a=sc.nextInt();
//        System.out.println(a*a);
    }
}