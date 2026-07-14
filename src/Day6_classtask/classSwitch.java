package Day6_classtask;
import java.util.Scanner;
class Switch{
    static void main(String[] args){

        System.out.print("Enter the colour :");

        Scanner sc=new Scanner(System.in);

        String colour=sc.nextLine();
        switch(colour){

            case "red":
                System.out.print("Stop");
                break;

            case "green":
                System.out.print("Go");
                break;

            case "yellow":
                System.out.print("Ready");
                break;

            default:
                System.out.print("Invalid colour");
                break;
        }
        sc.close();
    }
}