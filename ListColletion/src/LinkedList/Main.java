import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();

        list.add(new Student("Khánh", 1, 19));
        list.add(new Student("Linh", 2, 24));
        list.add(new Student("Lan", 3, 20));
        list.add(new Student("Hà", 4, 18));

        List<Student> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.add(new Student("Giang", 5, 30));

        Iterator iterator = list2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("abc: " + list2.isEmpty());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
}
