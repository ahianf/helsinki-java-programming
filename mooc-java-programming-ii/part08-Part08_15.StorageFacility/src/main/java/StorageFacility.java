import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> map;

    public StorageFacility() {
        map = new HashMap<>();
    }

    public void add(String unit, String item) {
        ArrayList<String> list;
        if (map.containsKey(unit)) {
            list = map.get(unit);
        } else {
            list = new ArrayList<>();
        }
        list.add(item);
        map.put(unit, list);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> list;
        if (map.containsKey(storageUnit)) {
            list = map.get(storageUnit);
        } else {
            list = new ArrayList<>();
        }
        return list;
    }

    public void remove(String storageUnit, String item) {

        if (!map.containsKey(storageUnit)) {
            return;
        }
        ArrayList<String> list = map.get(storageUnit);
        list.remove(item);

        if (list.size() == 0) {
            map.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String i : map.keySet()) {
            if (map.get(i).size() != 0) {
                list.add(i);
            }
        }
        return list;
    }

}
