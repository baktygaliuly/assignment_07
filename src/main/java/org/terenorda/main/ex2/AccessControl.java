package org.terenorda.main.ex2;

class AccessControl {
    public boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public boolean authorize(String username, String documentId) {
        return true;
    }
}

