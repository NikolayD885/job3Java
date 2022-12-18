package job3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {
    public static void main (String[] args){
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа.");
        ex1();
        System.out.println();
        System.out.println("Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее " +
                "арифметическое из этого списка.");
        ex2();

    }



    private static void ex1() {
        System.out.print("Введите длину списка: ");
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            int val = rd.nextInt( -100,100);
            list.add(val);
        }
        System.out.printf("Дан список целых чисел: %s%n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами: %s%n", list);
    }
    private static void ex2() {
        System.out.print("Введите длину списка: ");
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            int val = rd.nextInt( -100,100);
            list.add(val);
        }
        System.out.printf("Дан список целых чисел: %s%n", list);
        int max = max(list);
        int min = min(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i ++){
            sum += list.get(i);
        }
        float arithmeticMean = sum/list.size();
        System.out.printf("Минимальное число: %s%n", min);
        System.out.printf("Максимальное число: %s%n", max);
        System.out.printf("Среднее арифметическое: %s%n", arithmeticMean);

    }
}
