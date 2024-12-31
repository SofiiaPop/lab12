package ua.edu.ucu.apps.Task2;

public class Main {
    public static void main(String[] args) {
        Task task1 = () -> System.out.println("Executing Task 1");
        Task task2 = () -> System.out.println("Executing Task 2");
        Task task3 = () -> System.out.println("Executing Task 3");

        Signature signature1 = new Signature(task1);
        Signature signature2 = new Signature(task2);
        Signature signature3 = new Signature(task3);

        Group group = new Group();
        group.addSignature(signature1);
        group.addSignature(signature2);
        group.addSignature(signature3);

        group.apply();

        System.out.println("Signature 1 header: " + signature1.getHeader());
        System.out.println("Signature 2 header: " + signature2.getHeader());
        System.out.println("Signature 3 header: " + signature3.getHeader());
    }
}
