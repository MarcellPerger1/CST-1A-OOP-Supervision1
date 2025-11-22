package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P5;

public class DataPrinter {
    private String data;

    public DataPrinter(String data) {
        this.data = data;
    }

    public void printToConsole() {
        System.out.println("--- REPORT ---");
        System.out.println(this.data);
        System.out.println("--- END ---");
    }
}
