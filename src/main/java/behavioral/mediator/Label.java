package behavioral.mediator;

import behavioral.mediator.interfaces.UIMediator;

public class Label extends UIComponent{
    private String text;
    public Label(UIMediator mediator) {
        super(mediator);
    }
    public void setText(String text) {
        this.text = text;
        System.out.println("Status: " + text);
    }
}
