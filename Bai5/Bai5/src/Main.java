public class Main {
    public static void main(String[] args) {
        vanBan vb = new vanBan("   Xin chào    các  A bạn!   ");
        System.out.println("Số từ của văn bản: " + vb.demSoTu());
        System.out.println("Số lượng ký tự A: " + vb.demSoLuongKyTuA());

        vb.chuanHoaVanBan();
        System.out.println("Văn bản chuẩn hoá: " + vb.getContent());
    }
}