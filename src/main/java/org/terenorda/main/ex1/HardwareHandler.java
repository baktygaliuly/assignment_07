package org.terenorda.main.ex1;

public class HardwareHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public void handleRequest(SupportRequest request) {
        if (request.getPriority() <= 3) {
            System.out.println("Hardware team handling request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No suitable handler found for request: " + request.getDescription());
        }
    }
}

// Implement SoftwareHandler and NetworkHandler similarly

