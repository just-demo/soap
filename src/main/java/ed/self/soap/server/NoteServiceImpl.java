package ed.self.soap.server;

import ed.self.soap.api.Note;
import ed.self.soap.api.NoteService;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "ed.self.soap.api.NoteService")
public class NoteServiceImpl implements NoteService {

    @Override
    public Note find(Date date) {
        Note note = new Note();
        note.setDate(date);
        note.setBody("Be happy!");
        return note;
    }
}
