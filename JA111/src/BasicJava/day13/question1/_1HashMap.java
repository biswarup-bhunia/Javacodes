package BasicJava.day13.question1;

import java.util.HashMap;
import java.util.*;

public class _1HashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("West Bengal","kolkata");
        map.put("Gujrat","Gandhinagar");
        map.put("Haryana","Chandigarh");
        map.put("Bihar","Patna");
        map.put("Maharastra","Mumbai");
        map.put("Uttar Pradesh","Lucknow");

        Set<String> key = map.keySet();
        for (String x:key
             ) {
            System.out.println(x+"----"+map.get(x));
        }

    }
}
