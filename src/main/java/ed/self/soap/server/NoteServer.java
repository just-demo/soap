package ed.self.soap.server;

import javax.xml.ws.Endpoint;

public class NoteServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/notes", new NoteServiceImpl());
    }
}
