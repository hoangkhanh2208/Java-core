public class Dog {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " - " + age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    // @Override
    // public int compareTo(Dog o) {

    //     return this.getName().compareTo(o.getName());
    // }
}
