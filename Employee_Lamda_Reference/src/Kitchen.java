public class Kitchen extends Employee implements Comparable<Kitchen> {
    private int serviceChange;

    @Override
    int calculatorSalary() {
        return this.serviceChange + getBasicSalary();
    }
    public int getServiceChange() {
        return serviceChange;
    }
    public void setServiceChange(int serviceChange) {
        this.serviceChange = serviceChange;
    }

    public Kitchen(int id, String name, int age, int basicSalary, int serviceChange) {
        super(id, name, age, basicSalary);
        this.serviceChange = serviceChange;
    }

    @Override
    public int compareTo(Kitchen o) {
        return o.getName().compareTo(this.getName());
    }
}
