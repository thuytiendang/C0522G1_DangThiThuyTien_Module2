package ss14_sort_algorithms.practice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NHập độ dài của mảng:");
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
        System.out.println("\nquá trình sắp xếp:");
        bubbleByStep(list);
    }

    public static void bubbleByStep(int[] list) {
        boolean isSwap = true;
        for (int i = 0; i < list.length -1 && isSwap; i++) {
            isSwap = false;

            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    isSwap = true;
                }
            }
        }
        if (!isSwap){
            System.out.println("MẢng đã được sắp xếp trước đó. vì thế thuật toán này không cần thiết!");
        }

        System.out.print("Mảng sau khi sắp xếp là:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }

}
