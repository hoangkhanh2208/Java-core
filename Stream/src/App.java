import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class App {
    int data = 100;

    void change2(int data) {
        this.data = data + 50; 
    }

    public static void main(String[] args) throws Exception {
        // List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

        // numbers.stream().filter(num -> num % 2 != 0).forEach(n -> System.out.print(n + "\t"));
        
        App app = new App();
        
        int num = 4;

        
        change(num);
        System.out.println("Value: " + num);
    }

    private static void change(int num) {
        num = 8;
        System.out.println("value change: " + num);
    } 
}
