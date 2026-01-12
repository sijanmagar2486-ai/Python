package week7.workshop.week8.week9.week10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int id;
    private String name;

    // Constructor
    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
