
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahian
 */
public class MessagingService {

    private ArrayList<Message> lista;

    public MessagingService() {
        this.lista = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            lista.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return lista;
    }

}
