package OrganizationHierarchy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "employee_id,first_name,last_name,reports_to\n" +
                "mfly,Marty,McFly,jblogs\n" +
                "jblogs,Joe,Blogs,rboss\n" +
                "nmuller,Nicolas,Muller,jblogs\n" +
                "rboss,Robert,Boss,\n" +
                "trice,Travis,Rice,rboss";

        // Parse the CSV data
        List<Employee> employees = parseCSV(csvData);

        // Build the organization structure
        Map<String, List<Employee>> organization = new HashMap<>();
        Map<String, Employee> employeeDetails = new HashMap<>();
       Employee topBoss = null;

        for (Employee emp : employees) {
            employeeDetails.put(emp.id, emp);
            if (emp.reportsTo == null || emp.reportsTo.isEmpty()) {
                topBoss = emp;
            } else {
                organization.computeIfAbsent(emp.reportsTo, k -> new ArrayList<>()).add(emp);
            }
        }

        // Print the hierarchy
        printHierarchy(topBoss, organization, employeeDetails, 1);
    }

    private static List<Employee> parseCSV(String csvData) {
        List<Employee> employees = new ArrayList<>();
        String[] lines = csvData.split("\n");
        for (int i = 1; i < lines.length; i++) { // Skip header
            String[] parts = lines[i].split(",");
            employees.add(new Employee(parts[0], parts[1], parts[2], parts.length > 3 ? parts[3] : ""));
        }
        return employees;
    }

    private static void printHierarchy(Employee emp, Map<String, List<Employee>> organization, Map<String, Employee> employeeDetails, int level) {
        if (emp == null) return;
        printIndented(emp.getFullName(), level);
        List<Employee> subordinates = organization.getOrDefault(emp.id, new ArrayList<>());
        for (Employee sub : subordinates) {
            printHierarchy(sub, organization, employeeDetails, level + 1);
        }
    }

    private static void printIndented(String text, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }
}