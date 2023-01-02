import java.util.Date;

public class ReportFinData extends ReportsData {

    private final boolean reportsData;

    
    public ReportFinData(int id, int reportId, Date date, boolean reportsData) {
        super(id, reportId, date);
        this.reportsData = reportsData;
        this.setReportsType(ReportsType.Finansis);
        
    }
    
    public boolean getReportsData() {
        return reportsData;
    }




}
