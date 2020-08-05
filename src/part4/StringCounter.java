package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCounter {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner cs = new Scanner(System.in);
        String str = cs.nextLine();

        Pattern pattern = Pattern.compile("[ёЁа-яА-Яa-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        int nWorlds = 0;
        String[] shortWorld = str.split("\\b");
        int numberLettersShortWorld = shortWorld[0].length();

        while (matcher.find()) {
            int timeAmtShort = matcher.group().length();
            if (timeAmtShort < numberLettersShortWorld) {
                numberLettersShortWorld = timeAmtShort;
                shortWorld[0] = matcher.group();
            }
            nWorlds++;
        }

        matcher.reset();

        String[] longWorld = str.split("\\b");
        int numberLettersLongWorld = longWorld[0].length();

        while (matcher.find()) {
            int timeAmtLong = matcher.group().length();
            if (timeAmtLong > numberLettersLongWorld) {
                numberLettersLongWorld = timeAmtLong;
                longWorld[0] = matcher.group();
            }
        }


        System.out.println("--> In text " + nWorlds + " worlds");
        System.out.println("--> shortest world: " + shortWorld[0]);
        System.out.println("--> longest world: " + longWorld[0]);
        System.out.println();

        System.out.print("which letter will replace? ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        System.out.print("what character? ");
        Scanner keyboard = new Scanner(System.in);
        char character = keyboard.next().charAt(0);
        String result = str.replace(letter, character);

        System.out.print("\tletter = " + letter + ";");
        System.out.println(" character - " + character);
        System.out.println("\tsource string - \"" + str + "\"");

        System.out.println("\tresult - \"" + result + "\"");
    }
}
