public class Homework9Task7 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomeString(3, 56);
        System.out.println(stringBuilder1);

    }
    public static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append("+").append(b).append(" равно ").append(a+b).append("\n").append(a).append("-").append(b).append(" равно ").append(a-b).append("\n").append(a).append("*").append(b).append(" равно ").append(a*b).append("\n");
        return result;

    }

}
