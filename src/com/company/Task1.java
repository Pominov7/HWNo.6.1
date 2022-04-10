package com.company;

import java.util.*;

public class Task1 {
    //Процедура создания единичной (диагональной) матрицы:
    public static int[][] unitMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    matrix[i][j] = 0;
                } else if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    //Процедура создания нулевой матрицы:
    public static int[][] zeroMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    //Процедура для вывода матрицы на консоль:
    public static int[][] showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    //Процедура заполнения матрицы рандомными числами:
    public static int[][] randomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);//
            }
        }
        return matrix;
    }

    //Процедура сложения матриц:
    public static int[][] sumMatrix(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    //Процедура умножения матриц:
    public static int[][] multiplyMatrix(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        //1.Ввод данных, объявление переменных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        //2.Вывод данных на консоль
        System.out.println("Создание единичной (диагональной) матрицы: ");
        showMatrix(unitMatrix(matrix));
        System.out.println("Создание нулевой матрицы: ");
        showMatrix(zeroMatrix(matrix));
        System.out.println("Создание матриц: ");
        System.out.println("Матрица 1: ");
        showMatrix(randomMatrix(matrix));
        System.out.println("Матрица 2: ");
        showMatrix(randomMatrix(matrix1));
        System.out.println("Сумма матриц: ");
        showMatrix(sumMatrix(matrix, matrix1, matrix2));
        System.out.println("Умножение матриц: ");
        showMatrix(multiplyMatrix(matrix, matrix1, matrix2));
    }
}

