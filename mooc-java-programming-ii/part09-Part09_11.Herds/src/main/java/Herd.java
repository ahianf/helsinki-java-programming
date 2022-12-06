import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> list = new ArrayList<>();

    @Override
    public void move(int dx, int dy) {
        list.forEach(i -> i.move(dx, dy));
    }

    public void addToHerd(Movable movable){
        list.add(movable);
    }

    @Override
    public String toString() {
        String string = "";
        for (Movable i : list ){
            string = String.format("%s%s\n", string, i.toString());
        }
        return string;
    }
}
