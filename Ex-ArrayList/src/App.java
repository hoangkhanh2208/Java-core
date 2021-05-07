import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        
        String str;
        do {
            System.out.print("Input: ");
            str = sc.nextLine();

            if ((str instanceof String)) {
                int num = Integer.parseInt(str);
                list.add(num);
            }

            if (str.equalsIgnoreCase("q")) {
                break;
            }
            
        } while (!(str.equalsIgnoreCase("q")));

        System.out.println(list);

    }
}
