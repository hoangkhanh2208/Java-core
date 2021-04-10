package ArrayList;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
    }
}
