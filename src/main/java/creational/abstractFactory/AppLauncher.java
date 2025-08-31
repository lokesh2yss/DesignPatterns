package creational.abstractFactory;

import creational.abstractFactory.interfaces.GUIFactory;

public class AppLauncher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        GUIFactory factory = null;

        if(os.contains("Windows")) {
            factory = new WindowsFactory();
        }
        else if(os.contains(("MAc"))) {
            factory = new MacOSFactory();
        }
        Application app = new Application(factory);
        app.renderUI();
    }

}
