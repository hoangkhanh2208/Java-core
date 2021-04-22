import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonModel<Student> studentList = new PersonModel<>();

        studentList.add(new Student(1, "Khánh", 19));
        studentList.add(new Student(2, "Hoàng", 20));
        studentList.add(new Student(3, "Nam", 24));

        studentList.display();

        System.out.println("---------------------------");

        PersonModel<Employee> employeeList = new PersonModel<>();
        employeeList.add(new Employee(1, "Lan", 1000));
        employeeList.add(new Employee(2, "Hoàng", 1500));
        employeeList.add(new Employee(3, "Nam", 2000));

        employeeList.display();

        Collections.sort(employeeList, new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                
                return o1.getName().compareTo(o2.getName()); 
            }
            
        });

        System.out.println("---------------------------");

        employeeList.display();
        
        
    }
}
