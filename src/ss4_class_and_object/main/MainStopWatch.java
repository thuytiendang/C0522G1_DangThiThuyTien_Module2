package ss4_class_and_object.main;

import ss4_class_and_object.exercise.StopWatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 10000000; i++) {
            System.out.print("");
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
