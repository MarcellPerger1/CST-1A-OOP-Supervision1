package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P6a;

public class StudentRecord {
    private final String name;
    private final int age;  // could be char to force unsignedness
    private final String college;

    public StudentRecord(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCollege() {
        return college;
    }

    public void print() {
        System.out.println(name + ", age " + age + " (" + college + ")");
    }
}
