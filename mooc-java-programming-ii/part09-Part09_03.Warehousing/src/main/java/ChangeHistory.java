import java.util.ArrayList;

public class ChangeHistory {

    private final ArrayList<Double> lista;

    public ChangeHistory() {
        lista = new ArrayList<>();
    }

    public void add(double status) {
        lista.add(status);
    }

    public void clear() {
        lista.clear();
    }

    public double maxValue() {
        if (lista.size() == 0) {
            return 0D;
        }

        double maxValue = lista.get(0);

        for (double i : lista) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (lista.size() == 0) {
            return 0D;
        }
        double minValue = lista.get(0);

        for (double i : lista) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    public double average() {
        if (lista.size() == 0) {
            return 0D;
        }

        double sum = 0;

        for (double i : lista) {
            sum = i + sum;
        }

        return sum / lista.size();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
