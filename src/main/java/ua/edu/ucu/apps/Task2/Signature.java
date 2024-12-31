package ua.edu.ucu.apps.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Signature {
    private final String taskId;
    private final Task task;
    private final Map<String, String> header;

    public Signature(Task task) {
        this.taskId = UUID.randomUUID().toString();
        this.task = task;
        this.header = new HashMap<>();
    }

    public String getTaskId() {
        return taskId;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void addStamp(String key, String value) {
        header.put(key, value);
    }

    public void apply() {
        System.out.println("Applying task with ID: " + taskId);
        task.execute();
    }
}

