package PhamDucTien_23683071;
public abstract class HangHoa {
    public String maHang;  // Thuộc tính public
    public String tenHang;
    public int soLuongTon;
    public double donGia;

    // Constructor
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    // Phương thức trừu tượng
    public abstract double tinhVAT();
    public abstract String danhGiaMucDoBanBuon();
}

