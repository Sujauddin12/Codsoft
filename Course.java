package Codsoft.java;

public class Course {
    private String name;
    private int capacity;
    private String id;

    public Course(String name, int capacity, String id) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
