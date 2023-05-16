
public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	
	public GiaoDichNha(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, namGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	
	@Override
	public double tinhThanhTien() {
        double thanhTien;
        if (loaiNha.equals("cao cap")) {
            thanhTien = dienTich * donGia;
        } else {
            thanhTien = dienTich * donGia * 0.9;
        }
        return thanhTien;
    }
}
