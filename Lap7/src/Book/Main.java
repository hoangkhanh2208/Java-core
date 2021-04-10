package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> listSach = new ArrayList<SachGiaoKhoa>();
        ArrayList<DoAn> listDoAn = new ArrayList<DoAn>();
        ArrayList<TaiLieuDienTu> listTaiLieu = new ArrayList<TaiLieuDienTu>();
        
        System.out.println("Nhập số lượng sách giáo khoa muốn thêm: ");
        int x= sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.input();
            listSach.add(sachGiaoKhoa);
        }

        for (int i = 0; i < x; i++) {
            listSach.get(i).display();
        }

        System.out.println("Nhập số lượng đồ án muốn thêm: ");
        int y = sc.nextInt();
        
        for (int i = 0; i < y; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            DoAn doAn = new DoAn();
            doAn.input();
            listDoAn.add(doAn);
        }

        for (int i = 0; i < y; i++) {
            listDoAn.get(i).display();
        }

        System.out.println("Nhập số lượng tài liệu điện tử muốn thêm: ");
        int z = sc.nextInt();
        
        for (int i = 0; i < z; i++) {
            System.out.println("Nhập thông tài liệu thứ " + (i + 1) + ":");
            TaiLieuDienTu taiLieuDienTu = new TaiLieuDienTu();
            taiLieuDienTu.input();
            listTaiLieu.add(taiLieuDienTu);
        }

        for (int i = 0; i < z; i++) {
            listTaiLieu.get(i).display();
        }
    }
}
