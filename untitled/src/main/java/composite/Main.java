package composite;

public class Main {
    public static void main(String[] args) {
        Department hq = new Department("HQ");
        Department it = new Department("IT");
        Department hr = new Department("HR");

        Employee alice = new Employee("Alice", 70000);
        Employee bob = new Employee("Bob", 80000);
        Employee charlie = new Employee("Charlie", 60000);

        it.add(alice);
        it.add(bob);
        hr.add(charlie);

        hq.add(it);
        hq.add(hr);

        System.out.println("Total salary: " + hq.getSalary());
        System.out.println("XML Representation:");
        System.out.println(hq.toXml());
    }
}
