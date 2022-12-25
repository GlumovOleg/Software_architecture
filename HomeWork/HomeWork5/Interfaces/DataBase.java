package HomeWork.HomeWork5.Interfaces;

import java.util.Collection;

/** 
* Database Layer 
*/

public interface DataBase {
    
    void load();

    void save();

    Collection<Entity> getAll();

}
