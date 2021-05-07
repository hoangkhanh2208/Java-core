public class App {
    public static void main(String[] args) throws Exception {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        
        // ThreadOne threadOne2 = new ThreadOne();
        // threadOne2.start();
        // Thread.sleep(11000);
        threadOne.join();
        System.out.println("Hết giờ!");
        

        
        // ThreadTwo threadTwo = new ThreadTwo();

        // Thread t = new Thread(threadTwo);
        // t.start();




        
    }
}
