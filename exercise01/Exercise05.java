package exercise01;

public class Exercise05 {
    public static void main(String[] args){
        //Practice Problem 1
        /*
        int n = 4;
        for(int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */

        // Practice Problem 2

//        int sum = 0;
//        int a = 4;
//        for (int i=0; i<a; i++){
//            sum = sum + (2*i);
//        }
//        System.out.println(sum);


        // Practice Problme 2 using modulo
//        int sum = 0;
//        int a = 6;
//        for (int i=0; i<=a; i++){
//            if(i%2==0){
//                sum = sum + i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);

        // Practice Problme 2 without using modulo %
//        int sum = 0;
//        int a = 6;
//        for (int i=0; i<=a; i+=2){
//            System.out.println(i);
//        }



        // Practice problem 3 Odd number using modulo %
//        int n = 10;
//        for (int i=0; i<=n; i++){
//            if (i%2 == 1){
//                System.out.println(i);
//            }
//        }

        // Practice problem 3 Odd number wihtout modulo %
//        int n = 10;
//        for (int i=1; i<=n; i+= 2){
//            System.out.println(i);
//        }

        // Factorial
        int n = 5;
        int factorial = 1;
        for (int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
