package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.interfaces.RequestHandler;

abstract public class BaseHandler implements RequestHandler {
    protected RequestHandler next;
    @Override
    public void setNext(RequestHandler handler) {
        this.next = handler;
    }

    protected void forward(Request request) {
        if(next != null) {
            next.handle(request);
        }
    }
}
