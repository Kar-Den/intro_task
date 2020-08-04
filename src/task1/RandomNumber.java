package task1;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int number1 = new Random().nextInt(100);
        int number2 = new Random().nextInt(100);

        if (number1>number2) System.out.println(number1);
        else System.out.println(number1 + " " + number2);
    }
}
