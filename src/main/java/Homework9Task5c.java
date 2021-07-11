import java.util.Locale;

public class Homework9Task5c {
    public static void main(String[] args) {
        char a = "It's the possibility of having a dream come true that makes life interesting".charAt(5);
        System.out.println("It's" + " the ".replace("t", "T") + "possibility ".replace("p", "P") + "of ".replace("o", "O") + "having ".replace("h", "H") + "a " + "dream ".replace("d", "D") + "come ".replace("c", "C") + "true ".replace("t", "T") +"that ".replaceFirst("t", "T") + "makes ".replace("m", "M") + "life ".replace("l", "L") + "interesting".replaceFirst("i", "I"));




    }

}