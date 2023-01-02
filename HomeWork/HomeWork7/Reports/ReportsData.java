import java.util.Date;

public abstract class ReportsData {
    private int counter = 0;
    private int id;
    private int reportId;
    private Date date;
    private ReportsType reportsType;

    public void setReportsType(ReportsType reportsType) {
        this.reportsType = reportsType;
    }

    public int getId() {
        return id;
    }

    public int getReportId() {
        return reportId;
    }

    public Date getDate() {
        return date;
    }

    public ReportsType getReportsType() {
        return reportsType;
    }

    public ReportsData(int id, int reportId, Date date) {
        this.id = id;
        this.reportId = reportId;
        this.date = date;
    }

    {
        id = ++counter;
    }
}
