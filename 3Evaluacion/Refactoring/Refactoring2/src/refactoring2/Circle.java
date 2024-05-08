
package refactoring2;

public class Circle extends Shape{

    public Circle(double size) {
        super(size);
    }

    @Override
    public double area() {
        return Math.PI*getSize()*getSize()/4.0;
    }
}
