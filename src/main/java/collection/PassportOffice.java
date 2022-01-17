package collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {

    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsValue(citizen)) {
            citizens.put(citizen.getPassport(), citizen);
            return rsl = true;
        }
        return rsl;
    }


    public Citizen get(String passport) {
        for (Map.Entry<String, Citizen> maps: citizens.entrySet()) {
            if (maps.getKey().contains(passport)) {
                return maps.getValue();
            }
        }
        return null;
    }
}
