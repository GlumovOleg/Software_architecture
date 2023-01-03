import java.util.ArrayList;
import java.util.Collection;

public class ReportsBank implements Report {

    private static int counter = 100;
    private int id;

    private Collection<Report> reports = new ArrayList<>();

    public Collection<Report> getReports() {
        return reports;
    }

    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }
    
}
