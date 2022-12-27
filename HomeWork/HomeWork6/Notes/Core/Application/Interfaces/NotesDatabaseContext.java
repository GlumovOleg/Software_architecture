package HomeWork.HomeWork6.Notes.Core.Application.Interfaces;

import java.util.Collection;

import HomeWork.HomeWork6.Notes.Core.Domain.Note;

public interface NotesDatabaseContext {
    
    Collection<Note> getAll();
    boolean saveChange();

}
