package ss3_method.practice;

import java.util.Scanner;

public class CharacterOfArraySwap {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element " );
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Elements in array: ");
        for (int j =0; j< array.length; j++){
            System.out.print(array[j] + "\t");
        }

        for (int j =0 ; j< array.length/2; j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }

        System.out.println("\n" + "Reverse array: ");
        for (int j = 0 ; j< array.length; j++){
            System.out.print(array[j] + "\t");
        }

    }
}
