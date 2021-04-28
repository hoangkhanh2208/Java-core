public enum TheLoai {
    CHINH_TRI_PHAP_LUAT("Chính trị - pháp luật"),
    VAN_HOC_NGHE_THUAT("Văn học - nghệ thuật"),
    KHOA_HOC_CONG_NGHE("Khoa học công nghệ"),
    TRUYEN("Truyện"),
    TAM_LY("Tâm lý");

    private String ten;
    
    private TheLoai(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }
}
