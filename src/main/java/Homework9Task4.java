public class Homework9Task4 {
    public static void main(String[] args) {
        String[] mas3 = new String[10];
        mas3[0]  = "werwe wewewr werwer ";
        mas3[1]  = "werwerer";
        mas3[2]  = "wewere werewr";
        mas3[3]  = "zxczxc zxczzcz";
        mas3[4]  = "zxxzxcxc zxczxczc";
        mas3[5]  = "zxcxzczxxcz";
        mas3[6]  = "zxzxxzcczcxx";
        mas3[7]  = "asdasdasasda";
        mas3[8]  = "zxczxc";
        mas3[9]  = "asaasd asassasd asdasd";
            float average = 0f;
            for (String item : mas3) {
                average += (float) item.length();
            }
            average /= mas3.length;

            for (int j = 0; j < 10; j++) {
                if (mas3[j].length() < average) {
                    System.out.println("Строка меньшая чем средняя длина: ");
                    System.out.println(mas3[j] + " ee длина = " + mas3[j].length());
                }
            }
        }
    }



