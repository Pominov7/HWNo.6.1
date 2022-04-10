package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //Процедура создания одномерного массива типа int:
    public static int[] overloadMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        return mas;
    }

    //Процедура создания одномерного массива типа String:
    public static String[] overloadMas(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = "String " + i;
        }
        return str;
    }

    //Процедура создания двухмерного массива типа int:
    public static int[][] overloadMas(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);//заполнение массива рандомными числами
            }
        }
        return matrix;
    }

    //Процедура создания двухмерного массива типа float:
    public static float[][] overloadMas(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //заполнение массива рандомными числами
                matrix[i][j] = (float) Math.round(Math.random() * 10 * 10) / 10;
            }
        }
        return matrix;
    }

    //Процедура для вывода массивов на консоль:
    public static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    //Процедура для вывода массива float на консоль:
    public static void showFMatrix(float[][] matrix) {
        for (float[] row : matrix) {
            for (float item : row) {
                System.out.print(item + " | ");//Вывел массив через "|", для лучшей читаемости на экране
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //1.Ввод данных, объявление переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int n = in.nextInt();
        int[] mas = new int[n];
        String[] str = new String[n];
        int[][] matrix = new int[n][n];
        float[][] mass = new float[n][n];
        //2.Вывод  на консоль
        System.out.println("\nОдномерный массив типа int: ");
        System.out.println(Arrays.toString(overloadMas(mas)));
        System.out.println("\nОдномерный массив типа String: ");
        System.out.println(Arrays.toString(overloadMas(str)));
        System.out.println("\nДвухмерный массив типа int: ");
        showMatrix(overloadMas(matrix));
        System.out.println("\nДвухмерный массив типа float: ");
        showFMatrix(overloadMas((mass)));
    }
}
