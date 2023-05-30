import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String values = Integer.toString(num);
        int amount = values.length();
        double sum = 0;
        for (int i = 0; i < values.length(); i++) {
            char splitValues = values.charAt(i);
            int value = Character.getNumericValue(splitValues);
            sum += value;
        }
        return sum / amount;
    }
}
