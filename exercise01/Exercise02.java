package exercise01;

public class Exercise02 {
    public static void main(String[] args) {
        // Problem 1 convert in lowercase
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2 replace text
        String text = "Its Lower Case";
        text = text.replace(" ", "-");
        System.out.println(text);

        // Problem 3 
        String letter = "Dear |<name>|, Thanks a lot!";
        letter = letter.replace("|<name>|", "Kabir");
        System.out.println(letter);

        // Prbome 4 
        String myString = "This string contains  doubt trioles spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("    "));

        // Problem 5
        String letter02 = "Dear Kabir,\n \tThanks for learning java.\n \tThanks!";
        

        System.out.println(letter02);

    }   
}
