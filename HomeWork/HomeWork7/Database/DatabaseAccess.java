import java.util.Collection;

public interface DatabaseAccess {
    
    void addReports(Report report);
    void removeReports(Report report);

    Collection<ReportsFin> getAllReportsFins();
    Collection<ReportsBank> getAllReportsBanks();

}
