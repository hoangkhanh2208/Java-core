package Teacher_Manager;

public class Main {
    public static void main(String[] args) {
        Person person;

        person = new Teacher();
        person.input();
        System.out.println(person.toString());
        person = new Student();
        person.input();
        System.out.println(person.toString());
    }
}
