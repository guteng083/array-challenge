package collectionproblemsolvingchallenge;

import java.util.*;

public class DepartmentGrouping {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "IT");
        Employee bob = new Employee("Bob", "IT");
        Employee charlie = new Employee("Charlie", "HR");
        Employee david = new Employee("David", "IT");

        List<Employee> employees = new ArrayList<>(List.of(alice, bob, charlie, david));

        Map<String, DepartmentData> data = groupByDepartment(employees);
        data.forEach((k, v) ->

                System.out.println(k + ": " + "\n" + "totalEmployee" + ": " + v.getTotalEmployee()
                + "\n" + "listOfEmployees" + ": " + v.getEmployeeName())
        );

    }

    public static Map<String, DepartmentData> groupByDepartment(List<Employee> employees) {
        Map<String, DepartmentData> map = new HashMap<>();
        List<Employee> hr = new ArrayList<>();
        List<Employee> it = new ArrayList<>();
        List<Employee> tech = new ArrayList<>();

        for (Employee employee : employees) {
            switch (employee.getDepartment()) {
                case "HR":
                    hr.add(employee);
                    break;
                case "IT":
                    it.add(employee);
                    break;
                case "Tech":
                    tech.add(employee);
                    break;
                default:
                    break;
            }
        }

        DepartmentData dataHr = new DepartmentData(hr.size(), hr);
        DepartmentData dataIt = new DepartmentData(it.size(), it);
        DepartmentData dataTech = new DepartmentData(tech.size(), tech);


        map.put("HR", dataHr);
        map.put("IT", dataIt);
        map.put("Tech", dataTech);

        return map;
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

class DepartmentData {
    private int totalEmployee;
    private List<Employee> listOfEmployees;

    // Constructor
    public DepartmentData(int totalEmployee, List<Employee> listOfEmployees) {
        this.totalEmployee = totalEmployee;
        this.listOfEmployees = listOfEmployees;
    }

    // getters
    public int getTotalEmployee() {
        return totalEmployee;
    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public List<String> getEmployeeName() {
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : listOfEmployees) {
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }
}