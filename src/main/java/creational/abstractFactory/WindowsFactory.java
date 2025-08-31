package creational.abstractFactory;

import creational.abstractFactory.interfaces.Button;
import creational.abstractFactory.interfaces.Checkbox;
import creational.abstractFactory.interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
