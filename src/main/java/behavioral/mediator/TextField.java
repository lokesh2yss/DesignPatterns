package behavioral.mediator;

import behavioral.mediator.interfaces.UIMediator;

public class TextField extends UIComponent{
    private String text= "";
    public TextField(UIMediator mediator) {
        super(mediator);
    }
    public void setText(String newText) {
        this.text = text;
        System.out.println("TextField updated: " + newText);
        notifyMediator();
    }
    public String getText() {
        return text;
    }
}
