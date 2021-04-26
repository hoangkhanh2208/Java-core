/**
 * Waiter
 */
public class Waiter extends Employee implements Comparable<Waiter>{
    private int compensate;
    @Override
    int calculatorSalary() {       
        return this.compensate + getBasicSalary();
    }
    
    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public int compareTo(Waiter o) {
        return this.getName().compareTo(o.getName());
    }
}