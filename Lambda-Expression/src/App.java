import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    private static final class ComparatorImplementation implements Comparator<Dog> {
        @Override
        public int compare(Dog o1, Dog o2) {
            return o1.getAge() > o2.getAge() ? 1 : -1;
        }
    }

    public static void main(String[] args) throws Exception {
        // TreeSet<Dog> set = new TreeSet<>();

        // set.add(new Dog(5, "Ki"));
        // set.add(new Dog(2, "Meo"));
        // set.add(new Dog(5, "Cún"));
        // set.add(new Dog(7, "ket"));
        // set.add(new Dog(3, "Co"));
        // set.add(new Dog(7, "Bo"));
        // set.add(new Dog(3, "ro"));

        // Iterator<Dog> iterator = set.iterator();
        // Dog dog;
        // while (iterator.hasNext()) {
        //     dog = iterator.next();
        //     System.out.println(dog);
        // }


        // for (String string : list) {
        //     System.out.println(string);
        // }

        // list.forEach((v) -> {
        //     System.out.println(v);
        // });

        List<Dog> dogs = new ArrayList<>();
        
        dogs.add(new Dog(2, "Ki"));
        dogs.add(new Dog(5, "Bo"));
        dogs.add(new Dog(5, "Gau"));
        dogs.add(new Dog(8, "Cún"));

        dogs.forEach(action -> System.out.println(action));

        System.out.println();

        Collections.sort(dogs, (o1, o2) -> o2.getName().compareTo(o1.getName()));

        dogs.forEach(action -> System.out.println(action));

        Collections.sort(dogs, new ComparatorImplementation());

        System.out.println();

        dogs.forEach(action -> System.out.println(action));

        

    }
    
}
