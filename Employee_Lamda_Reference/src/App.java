import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t---------DANH SÁCH WAITER----------");
        List<Waiter> waiters = new ArrayList<>();
        
        waiters.add(new Waiter(1, "Khánh", 19, 2000, 500));
        waiters.add(new Waiter(2, "Hoàng", 21, 4000, 300));
        waiters.add(new Waiter(3, "Dũng", 53, 6000, 1000));
        waiters.add(new Waiter(4, "Nam", 37, 1000, 400));

        waiters.forEach(element -> System.out.println(element));

        System.out.println("\nDanh sách waiter sắp xếp theo tên từ (A -> Z): ");

        Collections.sort(waiters);

        waiters.forEach(System.out::println);

        waiters.sort((waiter1, waiter2) -> waiter1.calculatorSalary() - waiter2.calculatorSalary());

        System.out.println("\nDanh sách waiter sắp xếp tăng dần theo lương: ");

        waiters.forEach(System.out::println);


        System.out.println("\n\n\t\t----------DANH SÁCH KITCHEN-----------");

        List<Kitchen> kitchens = new ArrayList<>();

        kitchens.add(new Kitchen(1, "Chung", 59, 5000, 800));
        kitchens.add(new Kitchen(2, "Linh", 34, 6300, 300));
        kitchens.add(new Kitchen(3, "Vân", 63, 2400, 3000));
        kitchens.add(new Kitchen(4, "Hà", 62, 2500, 830));

        kitchens.forEach(System.out::println);
        
        System.out.println("\nDanh sách kitchen sắp xếp theo tên từ(Z -> A): ");

        Collections.sort(kitchens);

        kitchens.forEach(System.out::println);

        kitchens.sort((kitchen1, kitchen2) -> kitchen1.calculatorSalary() < kitchen2.calculatorSalary() ? 1 : -1);

        System.out.println("\nDanh sách kitchen sắp xếp giảm dần theo lương: ");

        kitchens.forEach(System.out::println);




        
        
    }

  
}
