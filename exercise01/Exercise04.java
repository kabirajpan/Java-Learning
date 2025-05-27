package exercise01;

public class Exercise04 {
    public static void main(String[] args){

        double aNum = Math.random() * 10;
        aNum =  (int) Math.floor(aNum);
        String aValue = "";

        if (aNum <= 3) {
            aValue = "Rock";
        } else if ((aNum > 3 )&& (aNum <= 6 )) {
            aValue = "Paper";
        } else if ((aNum > 6) && (aNum <= 9)) {
            aValue = "Scissor";
        }
        System.out.println(aValue);

        double bNum = Math.random() * 10;
        bNum =  (int) Math.floor(bNum);
        String bValue = "";

        if (bNum <= 3) {
            bValue = "Rock";
        } else if ((bNum > 3 )&& (bNum <= 6 )) {
            bValue = "Paper";
        } else if ((bNum > 6) && (bNum <= 9)) {
            bValue = "Scissor";
        }
        System.out.println(bValue);


        double myNum = Math.random() * 10;
        myNum =  (int) Math.floor(myNum);
        String myValue = "";



    }
}
