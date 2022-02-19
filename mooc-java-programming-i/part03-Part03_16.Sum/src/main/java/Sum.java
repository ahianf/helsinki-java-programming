
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {

    }

    public static int sum(ArrayList<Integer> numbers) {
        int suma = 0;
        for (Integer i : numbers) {
            suma += i;
        }
        return suma;
    }

}
