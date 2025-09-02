package structural.decorator;

import structural.decorator.interfaces.TextView;

public class PlainTextView implements TextView {
    private final String text;
    public PlainTextView(String text) {
        this.text = text;
    }
    @Override
    public void render() {
        System.out.println(text);
    }
}
