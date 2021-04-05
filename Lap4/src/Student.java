import java.util.Scanner;

public class Student{
    private int id;
    private String name;
    private float theoreticalPoint;
    private float practicePoint;
    private String school = "Techmaster";
    
    public Student() {

    }
    
    public Student(int id, String name, float theoreticalPoint, float practicePoint) {
        this.id = id;
        this.name = name;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên: ");

        name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");

        theoreticalPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");

        practicePoint = sc.nextFloat();
    }

    public float mediumScore() {
        float mediumscore = (theoreticalPoint + practicePoint) / 2;
        return mediumscore;
    }
    
    public void display() {
        System.out.println("Id: " + this.id + "\nName: " + this.name + "\nTrường: " + school + "\nTheoretical Point: " + theoreticalPoint + "\nPractice Point: " + this.practicePoint + "\nMedium Score: " + mediumScore());
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

    public float getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(float theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
