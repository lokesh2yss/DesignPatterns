package behavioral.chainOfResponsibility.interfaces;

import behavioral.chainOfResponsibility.Request;

public interface RequestHandler {
    void setNext(RequestHandler handler);
    void handle(Request request);
}
