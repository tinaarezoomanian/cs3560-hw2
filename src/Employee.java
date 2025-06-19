public class Employee {
    private String name;
    private int hours;

    public Employee(String n, int h) {
        name  = n;
        hours = h;
    }

    public double calculateSalary() {
        return hours * 20;
    }

    public int getHours() {
        return hours;
    }
}