package Employee;

import java.util.Scanner;

public class Programmer extends Employee {
    private int overtimeHours;

    public Programmer() {
    }

    public Programmer(int id, String name, int old, String sdt, String email, float salaryBasic, int overtimeHours) {
        super(id, name, old, sdt, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public float salary() {
        return getSalaryBasic() + this.overtimeHours * 200000;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tLương: " + salary() + "\n");
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        super.input();
        System.out.println("Số giờ làm thêm: ");
        overtimeHours = sc.nextInt();
    }
}
