package Employee;

public class FullTimeEmployee extends Employee implements IEmployee {

    
    public FullTimeEmployee() {
    }

    @Override
    public int calculatorSalary() {
        return 8 * getPaymentHour();
    }

    public FullTimeEmployee(String name, int paymentHour) {
        super(name, paymentHour);
    }
    

}
