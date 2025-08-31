package creational.abstractFactory;

import creational.abstractFactory.interfaces.Button;
import creational.abstractFactory.interfaces.Checkbox;
import creational.abstractFactory.interfaces.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    public void renderUI() {
        button.paint();
        checkbox.paint();
    }
}
