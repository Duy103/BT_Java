public class Main {
    public static void main(String[] args) {
        KhachHang kh = new KhachHang("Tran Van Duy", "123A", "CTD001");
        BienLai bienLai = new BienLai(kh, 1000, 1500);

        System.out.println("THÔNG TIN BIÊN LAI:");
        System.out.println("Họ tên chủ hộ: " + bienLai.getkh().getHoTenChuHo());
        System.out.println("Số nhà: " + bienLai.getkh().getSoNha());
        System.out.println("Mã số công tơ điện: " + bienLai.getkh().getMaSoCongToDien());
        System.out.println("Chỉ số điện cũ: " + bienLai.getChiSoDienCu());
        System.out.println("Chỉ số điện mới: " + bienLai.getChiSoDienMoi());
        System.out.println("Số tiền phải trả: " + bienLai.getSoTienPhaiTra());

        kh.capNhatThongTinRieng("Nguyen Van B", "456 XYZ Street", "CTD002");
        System.out.println("Họ tên chủ hộ: " + kh.getHoTenChuHo());
        System.out.println("Số nhà: " + kh.getSoNha());
        System.out.println("Mã số công tơ điện: " + kh.getMaSoCongToDien());
    }
}