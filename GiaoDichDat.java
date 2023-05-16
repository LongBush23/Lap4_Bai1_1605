
public class GiaoDichDat extends GiaoDich {
    protected String loaiDat;

    public GiaoDichDat(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (loaiDat.equals("A")) {
            thanhTien = dienTich * donGia * 1.5;
        } else {
            thanhTien = dienTich * donGia;
        }
        return thanhTien;
    }
}