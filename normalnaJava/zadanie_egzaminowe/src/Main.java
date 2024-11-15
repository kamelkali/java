import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Note note1 = new Note("Informacja o apelu", "Apel odbedzie sie o 14:30 na głownej sali");
        Note note2 = new Note("Zmiana sali", "Zmiania sali z 208 na 102 na 4 lekcji");

        List<Note> notes = new ArrayList<>();
        notes.add(note1);
        notes.add(note2);

        for (Note note: notes){
            note.showNote();
            note.diagnosticNote();
        }
    }
}