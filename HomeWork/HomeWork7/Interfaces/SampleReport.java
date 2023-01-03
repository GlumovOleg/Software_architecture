import java.util.Collection;

public interface SampleReport {
    
    Collection<ReportsData> getReportsData(Database database, int reportId);
}
