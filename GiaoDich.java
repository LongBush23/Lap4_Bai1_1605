
public abstract class GiaoDich {
	protected String maGiaoDich;
	protected NgayThang namGiaoDich;
	protected double donGia;
	protected double dienTich;
	
	public GiaoDich(String maGiaoDich, NgayThang namGiaoDich, double donGia, double dienTich) {
		this.maGiaoDich = maGiaoDich;
		this.namGiaoDich = namGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public NgayThang getNamGiaoDich() {
		return namGiaoDich;
	}
	public void setNamGiaoDich(NgayThang namGiaoDich) {
		this.namGiaoDich = namGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public abstract double tinhThanhTien();
	
}
	

