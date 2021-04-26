public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private int basicSalary;

    public Employee(int id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return   id + " - " + name + " - " + age + " - " + basicSalary + " - " + calculatorSalary();
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    abstract int calculatorSalary();

    
}
