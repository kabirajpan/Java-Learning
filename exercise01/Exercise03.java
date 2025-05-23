package exercise01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){
//        question 1
        int a = 4;
        if (a>10){
            System.out.println("your age is greater than 10");
        } else {
            System.out.println("Your age is smaller than 10");
        }


//        Question 2

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your subject 1 mark");
        int sub1 = sc.nextInt();
        System.out.println("Enter your subject 2 mark");
        int sub2 = sc.nextInt();
        System.out.println("Enter your subject 3 mark");
        int sub3 = sc.nextInt();

        int totalObtainMark = sub1 + sub2 + sub3;
        float totalSubjectMark = 300f;
        float percentageObtain = (totalObtainMark/totalSubjectMark) * 100;
        System.out.println(percentageObtain + "%");

        if ( sub1 < 28){
            System.out.println("You are fail in subject 1 your mark is " + sub1);
            System.out.println("you are fail");
        } else if (sub2 < 28) {
            System.out.println("You are fail in subject 2 your mark is " + sub2);
            System.out.println("you are fail");
        } else if (sub3 < 28) {
            System.out.println("You are fail in subject 3 your mark is " + sub3);
            System.out.println("you are fail");
        } else {
            System.out.println("you are pass in all subject");
            System.out.println("you are pass");
        }
    }
}
