package ss14_sort_algorithms.exercise;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];

        System.out.println("Nhập " + list.length + "giá trị:");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("nhập giá trị tại vị trí %d :", i);
            list[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng của bạn là:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertSort(list);
        System.out.println("\n Mảng sau khi sắp xếp là:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
    }
}
