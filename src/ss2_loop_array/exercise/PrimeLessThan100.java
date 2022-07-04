package ss2_loop_array.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int divisor = 0;
        for (int i = 2; i <= 100; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisor++;
                    }
                }if (divisor==2) {
                    System.out.println(i);
                }
                divisor = 0;
            }
        }
    }

