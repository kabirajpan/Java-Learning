package day03;
import java.util.Scanner;


public class GettingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your first num1");
        // int a = sc.nextInt();
        // System.out.println("Ente your second num2");
        // int b = sc.nextInt();
        // int sum = a+b;

        String str = sc.nextLine();
        System.out.println(str);
    }
}
