package day05;

import java.util.Scanner;

public class Day05_switchMethod {
    public static void main(String[] args){
        /* int age;
        System.out.println("Enter you age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are an Adult");
                break;
            case 23:
                System.out.println("you can do a job now");
                break;
            case 50:
                System.out.println("You can retire");
                break;
            default:
                System.out.println("please enter you age in this options [18, 23, 50]");
        } */

        /*
        String name = "kabir";

        switch (name){
            case "kabir":
                System.out.println("You name is Kabir");
                break;
            case "rohan":
                System.out.println("Your name is Rohan");
                break;
            case "karma":
                System.out.println("Your name is Karma");
                break;
            default:
                System.out.println("Enter your name from top the options available");
        }
        */

//        Enhance Switch
        String name = "kabir";
        switch (name) {
            case "kabir" -> {
                System.out.println("Your name is Kabir");
                System.out.println("Your age is 24");
                System.out.println("You do coding");
            }
            case "rohan" -> System.out.println("Your name is Rohan");
            case "karma" -> System.out.println("Your name is Karma");
            default -> System.out.println("Enter your name from top the options available");
        }
    }
}
