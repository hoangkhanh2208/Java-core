import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T o : al) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        final int NUM_OF_ELEMENT = 5;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            list.add("0" + i);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        System.out.println("--------------------");
        list.forEach(v -> System.out.println(v));
        
        Object[] arr = list.toArray();


    }
}
