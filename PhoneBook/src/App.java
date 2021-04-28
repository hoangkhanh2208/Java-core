import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, PhoneBook> map = new HashMap<>();

        map.put(2, new PhoneBook("Khánh"));
        map.put(5, new PhoneBook("Lan"));
        map.put(4, new PhoneBook("Hoàng"));
        map.put(3, new PhoneBook("Chinh"));
        map.put(6, new PhoneBook("Chung"));

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }

        TreeMap<Integer, PhoneBook> treeMap = new TreeMap<>(map);

        Iterator ite = treeMap.keySet().iterator();
        while (ite.hasNext()) {
            System.out.println(treeMap.get(ite.next()));
        }
        if (treeMap.containsKey(9)) {
            System.out.println("cc");
        } else {
            System.out.println("ff");
        }


        

    }
    
    
}
