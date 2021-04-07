package Teacher_Manager;

import java.util.Scanner;

public class Teacher extends Person {

    private float salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, float salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cho giáo viên: ");
        super.input();
        System.out.println("Salary: ");
        salary = sc.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() + "\tSalary: " + salary;
    }

    public void subject(String s) {
        System.out.println(getName());
    }



}
