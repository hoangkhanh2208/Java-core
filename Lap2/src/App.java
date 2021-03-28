import java.util.Scanner;

// import jdk.internal.jshell.tool.Feedback.FormatResolve;

// import jdk.internal.jshell.tool.Feedback.FormatResolve;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int choose;
        do {

            menu();
            choose = sc.nextInt();

            switch (choose) {
            case 1:
                int a = 3;
                int b = 4;

                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

                System.out.println(c);
                break;

            case 2:
                System.out.println("----- Tính MBI -----");

                System.out.println("Nhập cân nặng của bạn: ");
                double weight = sc.nextDouble();
                System.out.println("Nhập chiều cao của bạn: ");
                double height = sc.nextDouble();

                getBMI(weight, height);

                display(getBMI(weight, height));
                break;

            case 3:
                printNumber();
                break;

            case 4:
                inSoChan();
                break;

            case 5:
                fizzBuzz();
                break;
            
            case 6:
                sumInt();
                break;
            
            case 7:
                primeChecked();
             break;

            default:
                System.out.println("Không có lựa chọn này trong menu!");
                break;
            }
        } while (choose != 4);

    }
    

    
    static void menu() {
        System.out.println("-----------------------------");
        System.out.println("MENU");
        System.out.println("1. Tính cạnh huyền của tam giác vuông");
        System.out.println("2. Tính chỉ số BMI và đưa ra kết luận");
        System.out.println("3. Tháng ? có bao nhiêu ngày");
        System.out.println("4. Kiểm tra số chẵn từ 1 --> 100");
        System.out.println("5. Fizz and Buzz");
        System.out.println("6. Tổng các số chẵn");
        System.out.println("7. Số nguyên tố");


        System.out.println("6. CLOSE");

        System.out.print("Chọn: ");
        
    }
    
    static double getBMI(double weight, double height) {

        return weight / Math.pow(height, 2);
    }
    
    static void display(double bmi) {
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Bạn bị thiếu cân");
        } else if (bmi <= 24.9) {
            System.out.println("Bạn cân đối");
        } else {
            System.out.println("Bạn bị thừa cân");
        }
    }
    

    static void printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn xem: ");
        int month = sc.nextInt();

        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Tháng này có 31 ngày");
            break;

        case 2:
            System.out.println("Tháng này có 28 hoặc 29 ngày");
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Tháng này có 30 ngày");
            break;

        default:
            System.out.println("Không có tháng này");
            break;
        }
    }
    
    static void inSoChan() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + "\t");
        }
    }
    
    static void fizzBuzz() {
        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else {
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
    

    static void sumInt() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập n: ");

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Tổng các số chẵn: " + sum);
    }
    
    static void primeChecked() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        
    }
    
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
