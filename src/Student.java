// Student.java
public class Student {
    private String name;
    private String major;
    private double gpa;

    // no-arg constructor
    public Student() {
        name  = "";
        major = "";
        gpa   = 0.0;
    }

    // two-arg constructor
    public Student(String n, String m) {
        name  = n;
        major = m;
        gpa   = 0.0;
    }

    // three-arg constructor
    public Student(String n, String m, double g) {
        name  = n;
        major = m;
        gpa   = g;
    }

    public String getName() {
        return name;
    }
    public void setName(String nm) {
        name = nm;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String mj) {
        major = mj;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gp) {
        gpa = gp;
    }

    public String toString() {
        return "Name: "   + name
             + ", Major: " + major
             + ", GPA: "   + gpa;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return name.equals(other.name)
            && major.equals(other.major);
    }
}
