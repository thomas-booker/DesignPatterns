import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employeesClone1 = (Employees) employees.clone();
        Employees employeesClone2 = (Employees) employees.clone();

        List<String> list1 = employeesClone1.getEmployeeList();
        list1.add("Herbert");

        List<String> list2 = employeesClone2.getEmployeeList();
        list2.remove("Billy");

        System.out.println("Employees list: " + employees.getEmployeeList());
        System.out.println("EmployeesClone1 list: " + list1);
        System.out.println("EmployeesClone2 list: " + list2);
    }
}
