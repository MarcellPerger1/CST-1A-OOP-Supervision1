package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P5;

public class DataFetcher {
    private String data;

    public DataFetcher(String data) {
        this.data = data;
    }

    public String fetchDataFromDatabase() {
        System.out.println("Fetching data...");
        this.data = "raw data";
        return this.data;
    }
}
