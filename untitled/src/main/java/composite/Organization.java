package composite;

public abstract class Organization {
    public abstract void add(Organization component);
    public abstract void remove(Organization component);
    public abstract double getSalary();
    public abstract String toXml();
}
