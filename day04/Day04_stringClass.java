package day04;

public class Day04_stringClass {
    public static void main(String[] args) {
       String name = new String("Kabiraj Pan");
       name = "new String";
    //    System.out.println(name);  

        int a = 4;
        float d = 9;
        name = " its Kabir";
        System.out.print("this is: " + a + " this is: " + 9 + name + " first line ");
        System.out.println("this is: " + a + " this is: " + 9 + name + " second line ");
        System.out.println("this is: " + a + " this is: " + 9 + name + " third line");
        
        System.out.printf("Hello this is %d and this is %f \n", a, d);
        System.out.printf("Hello this is %d and this is %.2f \n", a, d);
        System.out.format("Hello this is %d and this is %f \n", a, d);
        System.out.format("Hello this is %d and this is %.2f \n", a, d);
    }
}
