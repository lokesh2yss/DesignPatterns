package structural.decorator;

import structural.decorator.interfaces.TextView;

abstract class TextDecorator implements TextView {
    protected final TextView inner;
    public TextDecorator(TextView inner) {
        this.inner = inner;
    }
}
