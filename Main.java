
public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich();

        // Thêm các giao dịch vào danh sách
        quanLyGiaoDich.themGiaoDich(new GiaoDichDat("GD001", new NgayThang(1, 9, 2013), 1000, 200, "A"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichDat("GD002", new NgayThang(2, 9, 2013), 1500, 300, "B"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD003", new NgayThang(3, 9, 2013), 2000, 150, "cao cap", "123 ABC"));
        quanLyGiaoDich.themGiaoDich(new GiaoDichNha("GD004", new NgayThang(4, 9, 2013), 3000, 200, "thuong", "456 XYZ"));

        // Xuất danh sách giao dịch
        System.out.println("Danh sách các giao dịch:");
        quanLyGiaoDich.xuatDanhSachGiaoDich();

        // Tính trung bình thành tiền của giao dịch đất
        double trungBinhThanhTien = quanLyGiaoDich.tinhTrungBinhThanhTienGiaoDichDat();
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTien);

        // Xuất các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch của tháng 9 năm 2013:");
        quanLyGiaoDich.xuatGiaoDichThangNam(9, 2013);
    }
}
