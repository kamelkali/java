/***************************************************************************************************************************************************************

    klasa: Note
    opis: Klasa jest reprezentacja notatki, tworzy notatkę oraz ją wypisuje za pomocą 2 metod
    pola: noteCounter - jest licznikiem notatki typu INT
          noteID - jest indentyfikatorem notatki typu INT
          noteTitle - zawiera tutuł notatki typu STRING
          noteContent - zawiera zawartość notatki typu String

    autor: 000000000001

***************************************************************************************************************************************************************/
public class Note {
    private  int noteCounter;
    private  int noteID;
    protected String noteTitle;
    protected String noteContent;

    public Note(String tytulNotatki, String trescNotatki) {
        this.noteTitle = tytulNotatki;
        this.noteContent = trescNotatki;
        noteCounter += 1;
        this.noteID = noteCounter;
    }

    public void showNote(){
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Note title:" + noteTitle);
        System.out.println("Note content: "+ noteContent);
        System.out.println("---------------------------------");

    }

    public void diagnosticNote(){
        System.out.println(noteTitle + ";" + noteContent + ";" + noteCounter + ";" + noteID + ";");
    }
}
