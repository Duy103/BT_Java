class BienLai {
    private KhachHang kh;
    private int chiSoDienCu;
    private int chiSoDienMoi;
    private double soTienPhaiTra;

    public BienLai(KhachHang kh, int chiSoDienCu, int chiSoDienMoi) {
        this.kh = kh;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
        this.soTienPhaiTra = tinhTienDien(chiSoDienCu, chiSoDienMoi);
    }

    private double tinhTienDien(int chiSoDienCu, int chiSoDienMoi) {
        return (chiSoDienMoi - chiSoDienCu) * 5;
    }

    public KhachHang getkh() {
        return kh;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public double getSoTienPhaiTra() {
        return soTienPhaiTra;
    }
}
