package BasicJava.Evalutation4.question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class storePlants {
    public static void main(String[] args) {
        //Part 1
        HashMap<String,Integer> map = new HashMap();
        map.put("Cactus",300);
        map.put("MoneyPlant",200);
        map.put("Tulshi",350);
        map.put("Jasmin",400);
        map.put("Lilly",150);

        Set<String> plantName = map.keySet();
        //Part 2
        for (String key:plantName
        ) {
            System.out.println(key+" plant price is "+map.get(key));
        }
    }
}
