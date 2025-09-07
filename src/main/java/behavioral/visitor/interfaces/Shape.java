package behavioral.visitor.interfaces;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
