package Question1;

public class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;
    
    public GeometricObject() {
    }

    public GeometricObject(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

    public String toString(){
        return ("Color: " + color + " and filled: " + filled);
    }
}