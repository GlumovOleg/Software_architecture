package HomeWork.HomeWork6.Notes.Core.Domain;

import java.util.Date;

public class Note {
    
    private int userId;
    private int id;
    private String title;
    private String details;
    private Date creatioDate;
    private Date editDate;
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDetails() {
        return details;
    }
    public Date getCreatioDate() {
        return creatioDate;
    }
    public Date getEditDate() {
        return editDate;
    }
    public Note(int userId, int id, String title, String details, Date creatioDate) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.creatioDate = creatioDate;
        this.userId = userId;   
    }
 
    @Override
    public String toString() {
        return String.format("[%d] - [%s] - [%s]", id, title, details);
    }
    
    
}
