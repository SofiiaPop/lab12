package ua.edu.ucu.apps.Task1;

public class ATM {
    private final Banknote firstItem;

    public ATM() {
        firstItem = new Banknote100(new Banknote50(new Banknote5()));
    }

    public void process(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Requested amount must be positive.");
        }
        try {
            firstItem.process(amount);
        } catch (Exception e) {
            System.out.println("Not possible to give this amount of money with present banknotes: " + amount);
        }
    }
}
