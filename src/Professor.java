public class Professor extends Employee {
    private String field;

    public Professor(String n, int h, String f) {
        super(n, h);
        field = f;
    }

    @Override
    public double calculateSalary() {
        return getHours() * 30;
    }
}