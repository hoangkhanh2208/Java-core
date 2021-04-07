package Teacher_Manager;

import java.util.Scanner;

public class Student extends Person{
    private float theoreticalPoint;
    private float praticePoint;
    
    public Student() {
    }

    public Student(int id, String name, int age, String address, float theoreticalPoint, float praticePoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.praticePoint = praticePoint;
    }

    @Override
    public void input() {
        System.out.println("\n\nNhập thông tin cho học sinh: ");
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Theoretical Point: ");     
        theoreticalPoint = sc.nextFloat();
        System.out.println("Practice Point: ");
        praticePoint = sc.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() + "\tTheoretical Point: " + theoreticalPoint + "\tPractice Point: " + praticePoint + "\tGPA: " + GPA();
    }

    public float getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(float theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public float getPraticePoint() {
        return praticePoint;
    }

    public void setPraticePoint(float praticePoint) {
        this.praticePoint = praticePoint;
    }


    public float GPA() {
        return ((this.praticePoint + this.theoreticalPoint) / 2);
    }
    
}
