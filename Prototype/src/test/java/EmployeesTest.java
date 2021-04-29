import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmployeesTest {

    Employees testSubject;

    @Before public void initialize() {
        testSubject = new Employees();
        testSubject.loadData();
    }

    @Test
    public void shouldReturnEmployeesClone() throws CloneNotSupportedException {
        // Given
        Employees employeesClone = (Employees) testSubject.clone();
        List<String> originalList = testSubject.getEmployeeList();

        // When
        List<String> cloneList = employeesClone.getEmployeeList();
        cloneList.remove("Billy");

        // Then
        assertFalse(cloneList.contains("Billy"));
        assertTrue(originalList.contains("Billy"));
    }

}
