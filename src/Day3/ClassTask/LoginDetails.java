package Day3.ClassTask;

import java.util.Scanner;
public class LoginDetails{
    public static void main(String[] args){
        String name = "Priya";
        int id = 123456780;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username:");
        String username = sc.nextLine();
        System.out.print("Enter the id:");
        int userid = sc.nextInt();
        if(name.equals(username)&&(id == userid)){
            System.out.println("Welcome  "+ name);
            System.out.println("Valid Credentials");
        }else{
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
}