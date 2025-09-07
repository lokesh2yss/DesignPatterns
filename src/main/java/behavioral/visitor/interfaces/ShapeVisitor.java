package behavioral.visitor.interfaces;

import behavioral.visitor.Circle;
import behavioral.visitor.Rectangle;

public interface ShapeVisitor {
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
}
