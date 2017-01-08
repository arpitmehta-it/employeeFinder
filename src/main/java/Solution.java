import java.util.List;

public class Solution {

    public Org_Employee closestCommonManager(Org_Employee ceo, Org_Employee employee1,
                                             Org_Employee employee2) {
        while (true) {
            Org_Employee reportingManager1 = findReportingManager(ceo, employee1);
            Org_Employee reportingManager2 = findReportingManager(ceo, employee2);
            if (reportingManager1 == null || reportingManager2 == null) {
                System.out.println("One of the two employee doesn't belong to company");
                return null;
            } else if (reportingManager1.equals(reportingManager2)) {
                return reportingManager1;
            }
            employee1 = reportingManager1;
            employee2 = reportingManager2;
        }
    }

    private Org_Employee findReportingManager(Org_Employee manager, Org_Employee employee) {

        List<Org_Employee> reports = manager.REPORTS;
        if (reports.contains(employee)) {
            return manager;
        } else {
            for (Org_Employee emp : reports) {
                Org_Employee reportingManager = findReportingManager(emp, employee);
                if (reportingManager != null)
                    return reportingManager;
            }
        }
        return null;
    }


}
