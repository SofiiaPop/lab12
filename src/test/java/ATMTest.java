

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Task1.ATM;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ATMTest {

    @Test
    public void testProcessExactAmount() {
        ATM atm = new ATM();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        atm.process(100);

        String expectedOutput = "Please receive 0 x 5\n" + //
                "Please receive 0 x 50\n" + //
                "Please receive 1 x 100\n";
        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    public void testProcessComplexAmount() {
        ATM atm = new ATM();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        atm.process(180);

        String expectedOutput = "Please receive 6 x 5\n" + //
                "Please receive 1 x 50\n" + //
                "Please receive 1 x 100\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testProcessInvalidAmount() {
        ATM atm = new ATM();
        String expectedOutput = "Not possible to give this amount of money with present banknotes: 123\n";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        atm.process(123);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testProcessZeroAmount() {
        ATM atm = new ATM();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> atm.process(0));
        assertEquals("Requested amount must be positive.", exception.getMessage(), "ATM should throw an exception for zero amount.");
    }

    @Test
    public void testProcessNegativeAmount() {
        ATM atm = new ATM();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> atm.process(-50));
        assertEquals("Requested amount must be positive.", exception.getMessage(), "ATM should throw an exception for negative amounts.");
    }
}

