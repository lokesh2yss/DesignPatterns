package structural.flyweight;

import structural.flyweight.interfaces.CharacterFlyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditorClient {
    private final CharacterFlyweightFactory factory = new CharacterFlyweightFactory();
    private final List<RenderedCharacter> document = new ArrayList<>();

    public void addCharacter(char c, int x, int y, String font, int size, String color) {
        CharacterFlyweight glyph = factory.getFlyweight(c, font, size, color);
        document.add(new RenderedCharacter(glyph, x, y));
    }
    public void renderDocument() {
        for(RenderedCharacter rc: document) {
            rc.render();
        }
        System.out.println("Total flyweight objects used: " + factory.getFlyweightCount());
    }
    private static class RenderedCharacter {
        private final CharacterFlyweight glyph;
        private final int x, y;

        private RenderedCharacter(CharacterFlyweight glyph, int x, int y) {
            this.glyph = glyph;
            this.x = x;
            this.y = y;
        }
        public void render() {
            glyph.draw(x, y);
        }
    }
}
