package Blackjack;

import java.util.Scanner;

public class Input {
    public static char getOption(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String text = scanner.next().toUpperCase();
        if (!text.equals("YES")&& !text.equals("NO"))
            return getOption("Only [yes|no].\n"+ msg);
        return text.charAt(0);
    }
}
