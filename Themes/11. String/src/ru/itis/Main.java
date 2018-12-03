package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hello = "Привет";
        String temp = hello; // привет
        hello = hello + " как дела?"; // привет как дела

        for (int i = 0; i < 10; i++) {
            hello = hello + i;
        }

        System.out.println(hello);
        StringBuilder stringBuilder = new StringBuilder(hello);
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }
        hello = stringBuilder.toString();
        System.out.println(hello);

        String s1 = "Привет";
        String s2 = "Привет";
        System.out.println(s1 == s2);

        String s3 = new String("Привет");
        String s4 = new String("Привет");
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s1));

        char charFromString = s4.charAt(3);
        int indexOfLetter = s4.indexOf("р");
        int lastIndexOfLetter = s4.lastIndexOf("р");
        char array[] = s4.toCharArray();
        String sub = s4.substring(3, 5);
        char tempArray[] = {'п','а','м','п','а','м'};
        String stringFromArray = new String(tempArray);
        String words[] = "Привет, как дела".split(" ");
    }
}
