package structural.decorator;

import structural.decorator.interfaces.TextView;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextView inner) {
        super(inner);
    }

    @Override
    public void render() {
        System.out.println("<b>");
        inner.render();
        System.out.println("</b>");
    }
}
