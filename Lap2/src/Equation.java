import java.util.Scanner;


public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nam = 2021 % 12;

        System.out.println(nam);

        System.out.println("Nhập a: ");
        float a = sc.nextInt();

        System.out.println("Nhập b: ");
        float b = sc.nextInt();

        System.out.println("Nhập c: ");
        float c = sc.nextInt();


        giaiPTBac2(a, b, c);
        
    }

    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
             System.out.println("Do a = 0 nên chuyển về phương trình bậc 1");
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;

        } else {

            float delta = b*b - 4*a*c;
            float x1;
            float x2;

            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }

        
    }
}
