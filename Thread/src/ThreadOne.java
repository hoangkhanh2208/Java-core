import java.util.Random;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            double rd = Math.random() * 10 ;
            int num = (int) rd;
            System.out.println(num);
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
