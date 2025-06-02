package day08;

public class Day08_Methods {
        static int sum(int a, int b){
            int result = a+b;
            return  result;
        }

        static int sumA(int ...arr){
            int result = 0;
            for (int a: arr){
                result += a;
            }
            return result;
        }

        static int sumB(int x, int ...arr){
            int result = x;
            for (int a: arr){
                result += a;
            }
            return result;
        }
    public static void main(String[] args){

        System.out.println(sum(4,8));
        System.out.println(sumA(3,4,5,9,2));
        System.out.println(sumB(3,4,9,3,4,20));

    }
}
