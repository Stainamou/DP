package composite;

public class Employee extends Organization {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Organization component) {
        throw new UnsupportedOperationException("Employees cannot have children.");
    }

    @Override
    public void remove(Organization component) {
        throw new UnsupportedOperationException("Employees cannot have children.");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXml() {
        return "<employee name=\"" + name + "\" salary=\"" + salary + "\"/>";
    }
}
