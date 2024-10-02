package PhamDucTien_23683071;

public class HangDienMay extends HangHoa {
    public int thoiGianBaoHanh;   // Thuộc tính public
    public double congSuat;

    // Constructor
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
                       int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10;  // Truy cập trực tiếp thuộc tính public donGia
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (soLuongTon < 3) {  // Truy cập trực tiếp soLuongTon
            return "Bán được";
        }
        return "Không đánh giá";
    }
}
