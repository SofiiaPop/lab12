package ua.edu.ucu.apps;

public class ATM {
    public ATM() {
        firstItem = new Banknote100(new Banknote50(new Banknote5()));
    }
    private Banknote firstItem ;
    public void process(int amount) {
        firstItem.process(amount);
    }
}
