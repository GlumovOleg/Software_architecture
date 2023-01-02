import java.util.Collection;

public interface Database {
    
    void save();

    void load();

    Collection<ReportsData> getAll();



}
