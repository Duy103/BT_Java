public class vanBan {
    private String content;

    // Hàm khởi tạo không tham số
    public vanBan() {
        this.content = "";
    }

    // Hàm khởi tạo với tham số là một xâu ký tự
    public vanBan(String st) {
        this.content = st;
    }

    // Phương thức đếm số từ của văn bản
    public int demSoTu() {
        // Sử dụng phương thức split để tách xâu thành mảng các từ dựa trên khoảng trắng
        String[] words = content.split("\\s+");
        return words.length;
    }

    // Phương thức đếm số lượng ký tự A (không phân biệt hoa thường) của văn bản
    public int demSoLuongKyTuA() {
        int count = 0;
        // Chuyển đổi cả văn bản và ký tự A thành chữ thường để so sánh
        String lowercaseContent = content.toLowerCase();
        char lowercaseA = 'a';

        for (int i = 0; i < lowercaseContent.length(); i++) {
            // Nếu ký tự tại vị trí i trong văn bản là ký tự A, tăng biến đếm lên 1
            if (lowercaseContent.charAt(i) == lowercaseA) {
                count++;
            }
        }

        return count;
    }

    // Phương thức chuẩn hoá văn bản
    public void chuanHoaVanBan() {
        // Xóa các ký tự trống ở đầu và cuối xâu
        content = content.trim();

        // Xóa các ký tự khoảng trắng kiền kề nhau ở giữa xâu
        content = content.replaceAll("\\s+", " ");
    }
    public String getContent() {
        return content;
    }
}