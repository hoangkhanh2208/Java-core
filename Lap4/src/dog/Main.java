package dog;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Nhập thông tin cho sinh viên: ");
        // Student studentList[] = new Student [10];
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Sinh viên thứ " + (i + 1));

        //     studentList[i] = new Student();
        //     studentList[i].input();
        // }

        // for (int i = 0; i < 3; i++) {
            
        //     System.out.println("-----------------");
        //     studentList[i].display();
        // }

        System.out.println("Nhập thông tin cho chó: ");
        Dog dogList[] = new Dog [10];
        for (int i = 0; i < 3; i++) {
            System.out.println("Con chó thứ " + (i + 1));

            dogList[i] = new Dog();
            dogList[i].input();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------");
            dogList[i].toString();
        }
    }
}