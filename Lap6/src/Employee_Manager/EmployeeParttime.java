package Employee_Manager;

import java.util.Scanner;

public class EmployeeParttime extends Employee {
    private int workingHours;

    public EmployeeParttime() {
        
    }

    public EmployeeParttime(int id, String name, String address, int date, int workingHours) {
        super(id, name, address, date);
        this.workingHours = workingHours;
    }

    

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tSalary: " + calculatorSalary() + "\n");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên part time: ");
        super.input();
        System.out.println("Working Hours: ");
        workingHours = sc.nextInt();
    }

    public float calculatorSalary() {
        return this.workingHours * 100000 * 30;
    }

    
}