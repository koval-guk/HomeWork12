package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Note> notes;

    public PhoneBook() {
        notes = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        notes.add(new Note(name, phoneNumber));
    }

    public Note find(String name) {
        for (Note note : notes) {
            if (note.getName().equals(name)) {

                return note;
            }
        }
        return null;
    }

    public List<Note> findAll(String name) {
        List<Note> sameNotes = new ArrayList<>();
        for (Note note : notes) {
            if (note.getName().equals(name)) {
                sameNotes.add(note);
            }
        }
        return sameNotes;
    }
}
