package LeftJoin;

import java.util.ArrayList;
import java.util.Map;

public class LeftJoin {

    public ArrayList<ArrayList<String>> leftJoin(Map<String, String> mapLeft, Map<String, String> mapRight) {
        ArrayList<ArrayList<String>> returnFinal = new ArrayList<>();

        for (String key : mapLeft.keySet()) {
            ArrayList<String> returnList = new ArrayList<>();

            if (mapRight.containsKey(key)) {

                returnList.add(key);
                returnList.add(mapLeft.get(key));
                returnList.add(mapRight.get(key));
            } else {
                returnList.add(key);
                returnList.add(mapLeft.get(key));
                returnList.add(mapRight.get(null));
            }
            returnFinal.add(returnList);
        }
        return returnFinal;
    }
}
