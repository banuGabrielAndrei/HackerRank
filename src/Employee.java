import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " " + salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    public static void sortEmployees(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()).
                                thenComparing(Employee::getName));
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 50000));
        employees.add(new Employee("David", 70000));
        employees.add(new Employee("Eve", 60000));
        Employee.sortEmployees(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
