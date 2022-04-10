package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task11();
        task22();
         task45();
    }

    private static void task11() {
        /**
         * 11. Дана непустая строка S. Вывести строку, содержащую символы строки S,
         * между которыми вставлено по одному пробелу.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input S:");
        String text = scanner.next();
        char[] text1 = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text1[i] + " ");
        }
    }

    private static void task22() {
        /**
         *22. Дана строка, изображающая целое положительное число. Вывести сумму цифр этого числа.
         */
        String numString = "\n12345";
        int sum = 0;
        int num = Integer.valueOf(numString);

        for (int i = 0; i < numString.length(); i++) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }

    private static void task45() {
        /**
         *45. Дана строка, состоящая из слов кириллицей, разделенных пробелами (одним или несколькими).
         * Найти длину самого короткого слова.
         */
            String inputString = "Red or green";
            String[] wordsArray = inputString.split("\\s");
            int minWordIndex = 0;
            int minWordLength = wordsArray[minWordIndex].length();
            for (int i = minWordIndex + 1; i < wordsArray.length; i++) {
                if (minWordLength > wordsArray[i].length())
                {
                    minWordLength = wordsArray[i].length();
                    minWordIndex = i;
                }
            }
            System.out.println("Min length -> " + minWordLength);
            System.out.println("Min length(word) -> " + wordsArray[minWordIndex]);
        }
    }
