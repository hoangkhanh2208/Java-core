package Employee;

public class PartTimeEmployee extends Employee implements IEmployee{
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int paymentHour, int workingHours) {
        super(name, paymentHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculatorSalary() {
       
        return workingHours * getPaymentHour();
    }

    
}
