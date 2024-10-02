package PhamDucTien_23683071;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private String ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, String ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.1;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (soLuongTon > 50 && ngayNhapKho.compareTo("today") > 10) {
            return "Bán chậm";
        }
        return "Chưa đánh giá";
    }
}
