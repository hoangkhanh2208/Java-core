package Employee_Manager;

import java.util.Scanner;

public class EmployeeFulltime extends Employee {
    private float salaryBonus;
    private final int workingTime = 8;
     
    
    public EmployeeFulltime() {
    }

    public EmployeeFulltime(float salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public EmployeeFulltime(int id, String name, String address, int date, float salaryBonus) {
        super(id, name, address, date);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tSalary: " + calculatorSalary() + "\n");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên full time: ");

        super.input();
        System.out.println("Salary end bonus: ");
        salaryBonus = sc.nextFloat();
    }

    public float calculatorSalary() {
        return ((workingTime * 100000 * 30) + salaryBonus);
    }

}