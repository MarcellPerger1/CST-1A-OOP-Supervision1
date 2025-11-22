package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P6b;

public record StudentRecord(String name, int age, String college) {
    public void print() {
        System.out.println(name + ", age " + age + " (" + college + ")");
    }
}
