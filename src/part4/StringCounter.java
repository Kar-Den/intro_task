package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCounter {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String str = cs.nextLine();
//        System.out.println(str);

        Pattern pattern = Pattern.compile("[ёЁа-яА-Яa-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        int nWorlds = 0;
        while (matcher.find()){
            nWorlds++;
        }

        System.out.println(nWorlds + " слов");
    }
}
