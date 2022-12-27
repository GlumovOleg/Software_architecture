package HomeWork.HomeWork6.Notes.Infrastucture;

import HomeWork.HomeWork6.Databases.NotesDatabase;
import HomeWork.HomeWork6.Databases.NotesRecord;
import HomeWork.HomeWork6.Notes.Core.Application.Interfaces.NotesDatabaseContext;
import HomeWork.HomeWork6.Notes.Core.Domain.Note;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());

    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase) database).getNotesTable().getRecord()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()));
        }
        return notesList;
    }

    
}
