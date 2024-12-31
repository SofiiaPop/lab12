package ua.edu.ucu.apps.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Banknote {
    public Banknote nextItem;
    private int banknoteNominale;

    public Banknote(int banknoteNominale) {
        this.banknoteNominale = banknoteNominale;
    }
    public void process(int amount) {
        int quantity = amount / banknoteNominale;
        int rest = amount % banknoteNominale;
        if (nextItem != null) {
            nextItem.process(rest);
        } else {
            if (rest != 0) {
                throw new IllegalArgumentException();
            }
        }
        System.out.format("Please receive %d x %d\n", quantity, banknoteNominale);
    };
}
