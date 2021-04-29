import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeeList;

    public Employees() {
        employeeList = new ArrayList<>();
    }

    public Employees(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public void loadData() {
        employeeList.add("Tom");
        employeeList.add("Billy");
        employeeList.add("Shirley");
        employeeList.add("Anne");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();

        for(String s : this.getEmployeeList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
