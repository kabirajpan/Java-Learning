package day05;

public class Day05_logicalClass {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // && (AND) operator
        if(a && b){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        // || (OR) operator
        if(a || b){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        // ! (NOT) operator
        System.out.println(!a);
        System.out.println(!b);


    }
}