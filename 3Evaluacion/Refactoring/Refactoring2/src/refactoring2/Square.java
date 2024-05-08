
package refactoring2;

public class Square extends Shape{

    public Square(double size) {
        super(size);
    }

    @Override
    public double area() {
        return getSize()*getSize();
    }
}
