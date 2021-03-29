package Exercise2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            float a, b, c, x1, x2, delta;  

            System.out.println("Giải phương trình bậc hai 1 ẩn ax2 + bx + c = 0 (a!=0)");

            do{
                System.out.print("Nhập số a (a != 0) = ");
                a = sc.nextFloat();

                if (a == 0) {
                    System.out.println("Số bạn nhập không thỏa mãn điều kiện. Mời bạn nhập lại");
                }
            }while(a == 0);

            System.out.print("Nhập số b = ");
            b = sc.nextFloat();

            System.out.print("Nhập số c = ");
            c = sc.nextFloat();

            

            delta = b*b - 4*a*c;
            
        
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.printf("Phương trình có 2 nghiệm là: "
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
