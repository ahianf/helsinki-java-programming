
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahian
 */
public class TodoList {

    private List<String> lista;

    public TodoList() {
        lista = new ArrayList<>();

    }

    public void add(String task) {
        lista.add(task);
    }

    public void print() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ": " + lista.get(i));
        }
    }

    public void remove(int number) {
        lista.remove(number - 1);
    }

}
