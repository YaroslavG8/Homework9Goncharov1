import java.util.Formatter;

public class Homework9Task1 {
    public static void main(String[] args) {
        print("Иваов", 5, "математика");
    }

         public static void print(String fullname, int mark, String  subject) {
         Formatter formatter = new Formatter();
         formatter.format("Студент %s получил %s по %s", fullname, mark, subject);
            System.out.println(formatter);

    }

    }

