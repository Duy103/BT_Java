class KhachHang {
    private String hoTenChuHo;
    private String soNha;
    private String maSoCongToDien;

    public KhachHang(String hoTenChuHo, String soNha, String maSoCongToDien) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongToDien = maSoCongToDien;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongToDien() {
        return maSoCongToDien;
    }

    public void setMaSoCongToDien(String maSoCongToDien) {
        this.maSoCongToDien = maSoCongToDien;
    }
    public void capNhatThongTinRieng(String hoTenChuHoMoi, String soNhaMoi, String maSoCongToDienMoi) {
        this.hoTenChuHo = hoTenChuHoMoi;
        this.soNha = soNhaMoi;
        this.maSoCongToDien = maSoCongToDienMoi;
    }
}