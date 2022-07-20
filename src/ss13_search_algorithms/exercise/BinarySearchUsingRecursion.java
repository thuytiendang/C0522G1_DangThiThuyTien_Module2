package ss13_search_algorithms.exercise;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,5,20,30,35,41,44, 50,55};
        System.out.println("NHập số cần tìm");
        int key = Integer.parseInt(scanner.nextLine());

        System.out.println(binarySearch(array,0, array.length-1,key));
    }
    public static int binarySearch(int[] array, int left, int right, int key){
        if (right >= left){
            int mid = (left + right) /2;

            if (key == array[mid]){
                return mid;
            }

            if (key > array[mid]){
                return binarySearch(array, mid + 1, right, key);
            }

            return binarySearch(array, left, mid - 1, key);
        }
        return -1 ;
    }
}
