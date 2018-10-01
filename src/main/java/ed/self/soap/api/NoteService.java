package ed.self.soap.api;

import ed.self.soap.api.Note;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface NoteService {
    @WebMethod
    Note find(Date date);
}
