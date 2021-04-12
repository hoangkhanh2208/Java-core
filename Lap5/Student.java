import java.util.Scanner;

public class Student{
    public int id;
    public String name;
    public float theoreticalPoint;
    public float practicePoint;
    static String school = "Techmaster";
    
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
        id = sc.nextInt();
        name = sc.nextLine();
        theoreticalPoint = sc.nextFloat();
        practicePoint = sc.nextFloat();
    }

    public float mediumScore() {
        float mediumscore = (theoreticalPoint + practicePoint) / 2;
        return mediumScore();
    }
    
    public void display() {
        System.out.println("Id: " + this.id + "\nName: " + this.name + "\nTheoretical Point: " + theoreticalPoint + "\nPractice Point: " + this.practicePoint + "\nMedium Score: " + this.mediumScore());
    }
}
