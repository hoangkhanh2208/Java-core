import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String choose = null;
        boolean exit = false;
        System.out.println("PHẦN MỀM QUẢN LÝ THƯ VIỆN");
        Scanner sc = new Scanner(System.in);
        Sach sach = new Sach();
        QLSach qlSach = new QLSach();

            showMenuThuThu();
            while (true) {
                choose = sc.nextLine();
                switch (choose) {
                case "1":
                    qlSach.themSach();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "0":
                    exit = true;
                    break;

                default:
                    System.out.println("Không hợp lệ! Chọn lại:");
                    break;
                }

                if (exit) {
                    break;
                }
                showMenuThuThu();
            }


        }
        
        












        
    }

   

    public static void showMenu() {
        System.out.println();
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sách");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Hiển thị sách");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }

    


}
