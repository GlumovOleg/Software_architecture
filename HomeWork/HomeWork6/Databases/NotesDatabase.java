package HomeWork.HomeWork6.Databases;

import HomeWork.HomeWork6.Notes.Infrastucture.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }

}
