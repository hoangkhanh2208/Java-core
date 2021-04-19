public enum DanhMuc {
    DIENTHOAI("Điện thoại"),
    LAPTOP("Laptop"),
    PHUKIEN("Phụ kiện");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private DanhMuc(String name) {
        this.name = name;
    }

    public boolean equalsIgnoreCase(DanhMuc dienthoai2) {
        return false;
    }
}
