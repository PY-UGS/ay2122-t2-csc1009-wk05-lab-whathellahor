package Question2;

abstract class Shape{

    protected double dim1, dim2;
    protected final double PI = 3.14;

    public abstract double area();

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}