import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (map.containsKey(licensePlate)) {
            return false;
        } else {
            map.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return map.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (map.containsKey(licensePlate)) {
            map.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate i : map.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        Set<String> set = new HashSet<>(map.values());
        for (String i : set) {
            System.out.println(i);
        }
    }

}
