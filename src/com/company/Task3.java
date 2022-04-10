package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.StringTokenizer;

public class Task3 {
    //Процедура вывода содержимого массива в строку через пробел:
    public static void lineSpaces(String[] str) {
        String newString = Arrays.toString(str);
        newString = newString.substring(1, newString.length() - 1);
        String spaceStr = newString.replace(",", " ");
        System.out.println(spaceStr);
    }

    //Процедура сортировки содержимого массива в обратном порядке (без учета регистра) от z до a:
    public static String[] sortRevers(String[] str) {
        Arrays.sort(str, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));  // сортируем
        return str;
    }

    //Процедура сортировки содержимого массива по количеству слов в строке (слова разделены пробелами):
    public static String[] sortCount(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                StringTokenizer s1 = new StringTokenizer(str[i]);
                int counter = s1.countTokens();
                StringTokenizer s2 = new StringTokenizer(str[j]);
                int counter2 = s2.countTokens();
                if (counter > counter2) {
                    String tmpStr = str[j];
                    str[j] = str[i];
                    str[i] = tmpStr;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        //1.Объявление переменных, ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк:");
        int n = in.nextInt();
        in.nextLine();
        String[] arrStr = new String[n];
        //2.Ввод текстовых строк:
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print("Введите строки: ");
            arrStr[i] = in.nextLine();//считываем строки
        }
        //3.Вывод  на консоль:
        System.out.println("Первоначальный массив: ");
        System.out.println(Arrays.toString(arrStr));
        System.out.println("\n1.Содержимое массива в строку через пробел: ");
        lineSpaces(arrStr);
        System.out.println("\n2.Сортированный массив в обратном порядке: ");
        lineSpaces(sortRevers(arrStr));
        System.out.println("\n3.Сортированный массив по количеству слов в строке: ");
        lineSpaces(sortCount(arrStr));
    }
}

