import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> map;

    public IOU() {
        map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        map.put(toWhom, map.getOrDefault(toWhom, 0D) + amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return map.getOrDefault(toWhom, 0D);
    }
}
