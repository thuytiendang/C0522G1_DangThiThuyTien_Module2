package ss8_cleanCode_refactoring.practice;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        return perimeter * height + 2 * baseArea;
    }
}
