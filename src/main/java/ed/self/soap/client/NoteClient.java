package ed.self.soap.client;

import ed.self.soap.api.Note;
import ed.self.soap.api.NoteService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class NoteClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/notes");
        // 1st argument service URI, refer to wsdl document above
        // 2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://server.soap.self.ed/", "NoteServiceImplService");
        Service service = Service.create(url, qname);
        NoteService noteService = service.getPort(NoteService.class);
        Note note = noteService.find(new Date());
        System.out.println(note.getBody());
    }
}
