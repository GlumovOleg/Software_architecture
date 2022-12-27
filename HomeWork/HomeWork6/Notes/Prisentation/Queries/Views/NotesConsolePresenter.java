package HomeWork.HomeWork6.Notes.Prisentation.Queries.Views;

import java.util.Collection;

import HomeWork.HomeWork6.Notes.Core.Application.Interfaces.NotesPresenter;
import HomeWork.HomeWork6.Notes.Core.Domain.Note;

public class NotesConsolePresenter implements NotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            // System.out.println(note.getId());
            System.out.println(note);
        }
        
    }
    
}
