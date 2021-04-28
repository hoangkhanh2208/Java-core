public class Person {

    private int number;
    private String name;
    private Position position;

    public Person(int number, String name, Position position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return number + " - " + name + " - " + position;
    }
   
}
