public class Dog extends Animal {
    @Override
    public void abc() {
        System.out.println("abc-rebonr");
    }
    
    void xyz() {
        System.out.println("xyz");
    }

    static void method(Animal obj) {
        if (obj instanceof Dog) {
           
        }
    }
}
