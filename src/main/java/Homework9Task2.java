import java.io.*;

public class Homework9Task2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите слово");
        String str1 = bufferedReader.readLine();
        String str2 = bufferedReader.readLine();
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2, str2.length()));
        System.out.println(str3);

        }
    }
