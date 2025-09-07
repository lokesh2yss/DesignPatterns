package behavioral.visitor;

import behavioral.visitor.interfaces.ShapeVisitor;

public class AreaCalculatorVisitor implements ShapeVisitor {
    @Override
    public void visitCircle(Circle circle) {
        double area = circle.getRadius()*2*Math.PI;
        System.out.println("Area of the circle is :"+area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double area = rectangle.getHeight()*rectangle.getWidth();
        System.out.println("Area of the rectangle is: "+area);
    }
}
