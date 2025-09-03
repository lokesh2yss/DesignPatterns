package structural.bridge;

import structural.bridge.interfaces.Renderer;

abstract class Shape {
    protected Renderer renderer;
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    public abstract void draw();
}
