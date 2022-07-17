package ss11_dsa_stack_queue.exercise.word_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi.");
        String string = scanner.nextLine();
        String[] array;
        array = string.trim().toLowerCase().split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);
    }
}