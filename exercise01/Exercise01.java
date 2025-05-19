package exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("See your Percentage");
        Scanner sc = new Scanner(System.in);

        int english = 0;
        int math = 0;
        int odia = 0;
        int science = 0; 
        int history = 0;
        int hindi = 0;
        int total = 0;
        
        System.out.println("Enter you Total Mark");
        total = sc.nextInt();
        
        System.out.println("Enter you english sub mark");
        english = sc.nextInt();
        System.out.println("Enter you math sub mark");
        math = sc.nextInt();
        System.out.println("Enter you odia sub mark");
        odia = sc.nextInt();
        System.out.println("Enter you science sub mark");
        science = sc.nextInt();
        System.out.println("Enter you history sub mark");
        history = sc.nextInt();
        System.out.println("Enter you hindi sub mark");
        hindi = sc.nextInt();

        int sum = english + math + odia + science + history + hindi;

        double myPercentage = ((double) sum/total) * 100;


        System.out.printf("Your Percentage is: %.2f%%\n", myPercentage);
    }
}
