package org.terenorda.main.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class SessionManager {
    private Map<String, String> activeSessions;

    public SessionManager() {
        this.activeSessions = new HashMap<>();
    }

    public String createSession(String username) {
        String sessionToken = UUID.randomUUID().toString();
        activeSessions.put(sessionToken, username);
        return sessionToken;
    }

    public boolean isValidSession(String sessionToken) {
        return activeSessions.containsKey(sessionToken);
    }
}
