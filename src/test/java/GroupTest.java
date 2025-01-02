import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Task2.Group;
import ua.edu.ucu.apps.Task2.Signature;
import ua.edu.ucu.apps.Task2.Task;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GroupTest {
    private Group group;
    private Signature signature1;
    private Signature signature2;
    private Signature signature3;

    @BeforeEach
    public void setUp() {
        group = new Group();

        Task task1 = () -> System.out.println("Executing Task 1");
        Task task2 = () -> System.out.println("Executing Task 2");
        Task task3 = () -> System.out.println("Executing Task 3");

        signature1 = new Signature(task1);
        signature2 = new Signature(task2);
        signature3 = new Signature(task3);

        group.addSignature(signature1);
        group.addSignature(signature2);
        group.addSignature(signature3);
    }

    @Test
    public void testAddSignatures() {
        Group newGroup = new Group();
        Signature newSignature = new Signature(() -> System.out.println("New Task"));
        newGroup.addSignature(newSignature);

        List<Signature> signatures = new ArrayList<>();
        signatures.add(newSignature);
        assertEquals(1, signatures.size());
    }
}

