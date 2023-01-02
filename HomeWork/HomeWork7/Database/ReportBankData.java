import java.util.Date;

public class ReportBankData extends ReportsData {

    private final boolean reportsData;

    public ReportBankData(int id, int reportId, Date date, boolean reportsData) {
        super(id, reportId, date);
        this.reportsData = reportsData;
        this.setReportsType(ReportsType.Bank);

    }

    public boolean getReportsData() {
        return reportsData;
    }
    
}
