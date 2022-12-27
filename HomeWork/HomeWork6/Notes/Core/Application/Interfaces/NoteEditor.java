package HomeWork.HomeWork6.Notes.Core.Application.Interfaces;

import HomeWork.HomeWork6.Notes.Core.Domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
}
