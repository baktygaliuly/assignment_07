package org.terenorda.main.ex1;

public class TestTicketingSystem {
    public static void main(String[] args) {
        HardwareHandler hardwareHandler = new HardwareHandler();


        SupportRequest request1 = new SupportRequest(1, "Hardware issue", 3);
        SupportRequest request2 = new SupportRequest(2, "Software issue", 4);
        SupportRequest request3 = new SupportRequest(3, "Network issue", 2);

        hardwareHandler.handleRequest(request1);
        hardwareHandler.handleRequest(request2);
        hardwareHandler.handleRequest(request3);
    }
}

