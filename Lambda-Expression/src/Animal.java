public class Animal {
    interface HelloWorld {
        public void greet();

        public void greetSomeOne(String name);
    }

    public void sayHello() {
        class EnglishGreet implements HelloWorld {
        @Override
            public void greet() {
                greetSomeOne("Khánh");
            }

        @Override
            public void greetSomeOne(String name) {
                System.out.println("Hello " + name);
            }
            
        }
    }
}
