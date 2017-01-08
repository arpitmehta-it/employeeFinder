import java.util.List;

public class Org_Employee {

    public final String ID;
    public final String NAME;
    public final List<Org_Employee> REPORTS;

    public Org_Employee(String ID, String NAME, List<Org_Employee> REPORTS){
        this.ID = ID;
        this.NAME = NAME;
        this.REPORTS = REPORTS;
    }


    @Override
    public String toString() {
        return "[" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", REPORTS=" + REPORTS +
                ']';
    }
}
