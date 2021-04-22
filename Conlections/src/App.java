import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list1 = Collections.EMPTY_LIST;
        

        List<Integer> list2 = Collections.emptyList();

        list2 = new ArrayList<>();
        list2.add(22);
        list2.add(33);
        list2.add(12);

        ListIterator iterator = list2.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        Collections.addAll(list2, 2, 3);

        System.out.println(list2);
        
    }
}
