import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class SolutionTest {

    private Org_Employee ceo;
    private Org_Employee employee1;
    private Org_Employee employee2;
    private Org_Employee employee3;
    private Org_Employee employee1_1;
    private Org_Employee employee1_2;
    private Org_Employee employee2_1;
    private Org_Employee employee2_2;
    private Org_Employee employee3_1;
    private Org_Employee employee3_2;

    private void prepareTest(){

        employee1_1 = new Org_Employee("5", "employee1_1", null);
        employee1_2 = new Org_Employee("6", "employee1_2", null);

        employee2_1 = new Org_Employee("7", "employee2_1", null);
        employee2_2 = new Org_Employee("8", "employee2_2", null);

        employee3_1 = new Org_Employee("9", "employee3_1", null);
        employee3_2 = new Org_Employee("10", "employee3_2", null);

        employee1 = new Org_Employee("2", "employee1", Arrays.asList(employee1_1, employee1_2));
        employee2 = new Org_Employee("3", "employee2", Arrays.asList(employee2_1, employee2_2));
        employee3 = new Org_Employee("4", "employee3", Arrays.asList(employee3_1, employee3_2));

        ceo = new Org_Employee("1", "ceo", Arrays.asList(employee1, employee2, employee3));
    }


    @Test
    public void closestCommonManager() throws Exception {

        prepareTest();
        Solution solution = new Solution();

        Org_Employee org_employee = solution.closestCommonManager(ceo, employee1_1, employee1_2);

        System.out.println(org_employee.toString());

    }

}