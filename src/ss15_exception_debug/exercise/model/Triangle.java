package ss15_exception_debug.exercise.model;


import ss15_exception_debug.exercise.exception.IllegalTriangleException;

public class Triangle {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle(double firstEdge, double secondEdge, double thirdEdge) throws IllegalTriangleException{
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0){
            throw new IllegalTriangleException("Nhập các cạnh lớn hơn 0.");
        } else if (firstEdge + secondEdge <= thirdEdge || thirdEdge + secondEdge <= firstEdge || thirdEdge + firstEdge <= secondEdge){
            throw new IllegalTriangleException("hai cạnh cộng lại phải lớn hơn hoặc bằng cạnh còn lại");
        } else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }

    public Triangle() {
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "firstEdge: " + this.firstEdge +
                ", secondEdge: " + this.secondEdge +
                ", thirdEdge: " + this.thirdEdge;
    }
}
