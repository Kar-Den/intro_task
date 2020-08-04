package part1.task3;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }
    }
}
