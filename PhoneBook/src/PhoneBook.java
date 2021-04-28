
public class PhoneBook {
    private String name;
    private int age;
    public static String address = "avc";
    
    public PhoneBook() {

    }
    
    public void abc() {
        System.out.println(address);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PhoneBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public void setName(String name) {
        this.name = name;
    }
        
}