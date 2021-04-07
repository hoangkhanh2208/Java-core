package Employee;

import java.util.Scanner;

public class Tester extends Employee{
    private int soLoi;

    public Tester() {
    }

    public Tester(int id, String name, int old, String sdt, String email, float salaryBasic, int soLoi) {
        super(id, name, old, sdt, email, salaryBasic);
        this.soLoi = soLoi;
    }

    @Override
    public void display() {
      
        super.display();
        System.out.print("\tSố lỗi phát hiện: " + soLoi + "\tLương: " + salary() + "\n" );
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        super.input();
        System.out.println("Số lỗi phát hiện: ");
        soLoi = sc.nextInt();
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public float salary() {
        return getSalaryBasic() + this.soLoi * 50000;
    }
}
