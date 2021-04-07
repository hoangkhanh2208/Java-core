package Employee;

import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private int old;
    private String sdt;
    private String email;
    private float salaryBasic;

    public Employee() {
    }

    public Employee(int id, String name, int old, String sdt, String email, float salaryBasic) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.sdt = sdt;
        this.email = email;
        this.salaryBasic = salaryBasic;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Old: ");
        old = Integer.parseInt(sc.nextLine());
        System.out.println("Telephone Number: ");
        sdt = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Salary Basic: ");
        salaryBasic = sc.nextFloat();
    }
    
    public void display() {
        System.out.print("- ID: " + id + "\tName: " + name + "\tOld: " + old + "\tSdt: " + sdt + "\tEmail: " + email );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(float salaryBasic) {
        this.salaryBasic = salaryBasic;
    }
    
    
}
