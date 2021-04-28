import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSach {
    public static Scanner sc = new Scanner(System.in);

    private List<Sach> dsSach;
    private QLFileSach fileSach;
    
    public QLSach() {
        fileSach = new QLFileSach();
        dsSach = fileSach.read();
    }

    public void themSach() {
        int n;
        try {
            do {
                System.out.println("Nhập số lượng sách muốn thêm: ");
                n = sc.nextInt();

            } while (!(n > 0 || n < 100));

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
                Sach sach = new Sach();
                sach.input();
                dsSach.add(sach);
                fileSach.write(dsSach);
            }

        } catch (Exception e) {
            System.out.println("Kí tự không hợp lệ!!!");
        }
    }

    public void inThongTinSach() {
        System.out.println("\nDanh sách các sách có trong thư viện: ");
        if (dsSach != null && dsSach.isEmpty()) {
            System.out.println(" Thư viện trống!!!");
        }
        dsSach.forEach(element -> System.out.println(element));
    }
    


}
