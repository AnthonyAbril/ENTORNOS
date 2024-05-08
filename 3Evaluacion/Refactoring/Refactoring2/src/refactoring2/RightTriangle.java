
package refactoring2;

public class RightTriangle extends Shape{

    public RightTriangle(double size) {
        super(size);
    }

    @Override
    public double area() {
        return getSize()*getSize()/2.0;
    }
}
