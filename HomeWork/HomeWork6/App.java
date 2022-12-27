package HomeWork.HomeWork6;

import HomeWork.HomeWork6.Databases.NotesDatabase;
import HomeWork.HomeWork6.Notes.Core.Application.ConcreteNoteEditor;
import HomeWork.HomeWork6.Notes.Infrastucture.DatabaseContext;
import HomeWork.HomeWork6.Notes.Prisentation.Queries.Controllers.NotesController;
import HomeWork.HomeWork6.Notes.Prisentation.Queries.Views.NotesConsolePresenter;

/**
 * Приложение "редактор заметок"
 */

public class App {

    public static void main(String[] args) {
        
        NotesController notesController = new NotesController(
            new ConcreteNoteEditor(new DatabaseContext(new NotesDatabase()), new NotesConsolePresenter()));
        notesController.routeGetAll();
    }
}
