package Question2;

class Circle extends Shape {

    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area(){
        return PI*Math.pow(dim1, 2);
    }
}