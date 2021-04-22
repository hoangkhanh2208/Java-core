import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        boolean check = true;

        File file = new File("PrimeNumber.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        String strFile = "";
           while(check){
               str = sc.nextLine();
               if (str.toUpperCase().equals("X") || str.toUpperCase().equals("Q")) {
                   check = false;
                    System.exit(0);
                }
                try {
                    int num = Integer.valueOf(str);
                    if (isPrime(num)) {
                        strFile = num + " là số nguyên tố";
                    }
                    else {
                        strFile = num + " không phải số nguyên tố";
                    }
                } catch (Exception e) {
                    System.out.println(str + " Không phải là số");
                } finally {
                
                }
               
                
            }

        
    }
    

    static boolean isPrime(int n) throws Exception {

        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
                
        return true;

    }
    
}
