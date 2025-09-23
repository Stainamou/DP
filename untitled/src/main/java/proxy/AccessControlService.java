package proxy;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AccessControlService {
    private static final AccessControlService instance = new AccessControlService();
    private final ConcurrentHashMap<String, Set<String>> permissions = new ConcurrentHashMap<>();

    private AccessControlService() {}

    public static AccessControlService getInstance() {
        return instance;
    }

    public void allowUser(String documentId, String username) {
        permissions.computeIfAbsent(documentId, k -> new HashSet<>()).add(username);
    }

    public boolean isAllowed(String documentId, String username) {
        return permissions.getOrDefault(documentId, java.util.Collections.emptySet()).contains(username);
    }
}
