package Shape;

public class Circle extends Shape implements ICircle{
    public int banKinh;

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình tròn: " + (double) Math.round((Math.PI * banKinh * banKinh) * 100) / 100);
    }

    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hình tròn: " + (double) Math.round((2 * banKinh * Math.PI) * 100) / 100);

    }

    public Circle(int banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void tinhDuongKinh() {
        System.out.println("Đường kính: " + (2 * banKinh));
    }
}
