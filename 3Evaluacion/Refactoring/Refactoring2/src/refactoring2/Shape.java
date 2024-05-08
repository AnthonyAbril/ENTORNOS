
package refactoring2;

public abstract class Shape {

    private double size;

    public Shape(double size) {
            this.size = size;
    }
    
    public double getSize() {
        return size;
    }
    
    public abstract double area();
}