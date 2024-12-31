package ua.edu.ucu.apps.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private final String groupId;
    private final List<Signature> signatures;

    public Group() {
        this.groupId = UUID.randomUUID().toString();
        this.signatures = new ArrayList<>();
    }

    public void addSignature(Signature signature) {
        signatures.add(signature);
    }

    public void apply() {
        System.out.println("Applying group with ID: " + groupId);
        for (Signature signature : signatures) {
            signature.addStamp("groupId", groupId);
            signature.apply();
        }
    }
}

