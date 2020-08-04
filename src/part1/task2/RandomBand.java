package part1.task2;

public class RandomBand {
    public static void main(String[] args) {
        int min = -100;
        int max = 100;

        int number1 = rnd(min, max);
        int number2 = rnd(min, max);
        int number3 = rnd(min, max);

        System.out.println((number1 > 0 && number2 > 0 && number3 > 0) ? "Все числа положительные" : "Не все числа положительные");

    }

    private static int rnd(int min, int max) {
        int diapason = max + Math.abs(min);
        return (int) (Math.random() * diapason) - max;
    }
}
