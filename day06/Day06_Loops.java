package day06;

public class Day06_Loops {
    public static void main(String[] args){

        // For loop
        int n = 3;
        for (int i =0; i<n; i++){
            System.out.println("I am for loop");
        }

        //While loop
        int a = 0;
        while (a<5){
            System.out.println("i am while");
            a++;
        }
        System.out.println(a);

        //do while
        int b = 0;
        do {
            System.out.println("i am do while");
            b++;
        } while (b < 5);
        System.out.println(b);
    }
}
