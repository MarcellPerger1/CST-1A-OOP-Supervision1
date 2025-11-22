package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P6a;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentRecordTest {
    @Test
    void print() {
        ByteArrayOutputStream fakeOutBA = new ByteArrayOutputStream();
        PrintStream fakeOut = new PrintStream(fakeOutBA);
        PrintStream origOut = System.out;
        System.setOut(fakeOut);
        String output;
        try {
            new StudentRecord("Marcell Perger", 18,
                    "Fitzwilliam College").print();
            fakeOut.flush();
            output = fakeOutBA.toString();
        } finally {
            System.setOut(origOut);
        }
        assertEquals("Marcell Perger, age 18 (Fitzwilliam College)"
                + System.lineSeparator(), output);
    }
}
