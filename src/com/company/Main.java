package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here


        System.out.print("Enter text to check it is palindrome : ");
        Scanner get_text = new Scanner(System.in);
        String text = get_text.nextLine();
        check_text(text);
    }

    private static void check_text(String text) {
        if (text.isEmpty()) {
            System.out.println("----------------------------------");
            System.out.println("|           Enter Text           |");
            System.out.println("----------------------------------");
            String[] args = new String[0]; // Or String[] args = {};
            main(args);
        } else {
            //remove spaces form text
            String reove_spe_chars = text.replaceAll("\\s+", "");

            //remove special characters form text
            String remove_special_chars = reove_spe_chars.replaceAll("[\\W]", "");

            //assign string to final variable with lowercase
            String final_string = remove_special_chars.toLowerCase();

            //making new string builder
            StringBuilder text_reverse = new StringBuilder();

            //append string to string builder
            text_reverse.append(final_string);

            //reverse string builder
            text_reverse = text_reverse.reverse();

            String rev_tex = text_reverse.toString();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("  string                            : " + text);
            System.out.println("  string without spaces             : " + reove_spe_chars);
            System.out.println("  string without special characters : " + final_string);
            if (rev_tex.equals(final_string)) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("  string                            : " + text + " is palindrome string");
                System.out.println("----------------------------------------------------------------------------");
            } else {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("  string                            : " + text + " is not palindrome string");
                System.out.println("----------------------------------------------------------------------------");
            }
        }

        System.out.print("Enter Another word yes(Y),No(N)");
        Scanner rerun = new Scanner(System.in);
        String return_text = rerun.nextLine();
        if (return_text.equals("Y")) {
            try {
                Runtime.getRuntime().exec("cmd /c cls");
                String[] args = new String[0];
                main(args);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.exit(0);
        }
    }
}
