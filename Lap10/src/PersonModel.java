import java.util.ArrayList;
import java.util.Comparator;

public class PersonModel<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public void add(T obj) {
        list.add(obj);
    }

    public void display() {
        for (T i : list) {
            System.out.println(i);
        }
    }

    public static void sort(PersonModel<Employee> employeeList, Comparator<Employee> comparator) {
    }
}
