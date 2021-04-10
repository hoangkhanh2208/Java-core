package Employee;

public class Employee{
    private String name;
  
    private int paymentHour;

    public Employee() {
    }

    public Employee(String name, int paymentHour) {
        this.name = name;
        this.paymentHour = paymentHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentHour() {
        return paymentHour;
    }

    public void setPaymentHour(int paymentHour) {
        this.paymentHour = paymentHour;
    }

}
