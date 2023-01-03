public class ReportsFin implements Report {

    private static int counter = 0;

    private int id;

    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

}
