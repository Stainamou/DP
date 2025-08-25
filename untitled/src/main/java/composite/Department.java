package composite;
import java.util.ArrayList;
import java.util.List;

public class Department extends Organization {
    private String name;
    List<Organization> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(Organization component) {
        components.add(component);
    }

    @Override
    public void remove(Organization component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Organization component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }
}
