import java.util.ArrayList;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 125313432;
        float i = 123.313f;

        String s2 = Integer.toString(n);
        String s3 = Float.toString(i);
        
        System.out.println(s2);

        System.out.println(i);

        System.out.println(String.format(Locale.GERMAN,"n = %,.1f", n));
    }
}
