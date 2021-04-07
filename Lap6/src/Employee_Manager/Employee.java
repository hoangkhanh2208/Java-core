package Employee_Manager;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Employee {
    private int id;
    private String name;
    private String address;
    private int date;
    public Employee() {

    }
    
    public Employee(int id, String name, String address, int date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.date = date;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();
        System.out.println("Date: ");
        date = sc.nextInt();
    }
    
    public void display() {
        System.out.print("ID: " + id + "\tName: " + name + "\tAddress: " + address + "\tDate: " + date);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
