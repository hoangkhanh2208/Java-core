package dog;

import java.util.Scanner;

public class Dog {
    private String breed;
    private int size;
    private int age;
    private String color;
    
    public Dog() {
    }

    public Dog(String breed, int size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giống chó : ");
        breed = sc.nextLine();

        System.out.println("Nhập kích thước: ");

        size = sc.nextInt();
        System.out.println("Nhập tuổi của chó: ");

        age = sc.nextInt();
        System.out.println("Nhập màu chó: ");

        color = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", breed=" + breed + ", color=" + color + ", size=" + size + "]";
    }
    
    public void eat() {

    }
    
    public void sleep() {

    }
    
    public void run() {
        
    }
    
}
