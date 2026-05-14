import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= NHẬP THÔNG TIN HÓA ĐƠN =========");
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double gia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng mua: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Khách có thẻ thành viên? (true/false): ");
        boolean memberStatus = sc.nextBoolean();
        System.out.println("============  HÓA ĐƠN ============");
        System.out.printf("Khách hàng: %s",tenKhachHang);
        System.out.printf("\nSản phẩm: %s",tenSanPham);
        System.out.printf("\nSố lượng: %d", soLuong);
        System.out.println("\nĐơn giá: " + String.format("%,.2f", gia) + "VND");
        double thanhTien = soLuong * gia;
        System.out.println("Thành tiền : " + String.format("%,.2f", thanhTien) + " VND");
        double discount =0;
        if(memberStatus) {
            discount = thanhTien * 0.1;
            System.out.println("Giảm giá thành viên (10%): " + String.format("%,.2f", discount) + "VND");
        }
        else  {
            System.out.println("Giảm giá thành viên (10%): 0.00 VND");
        }
        double VAT = 0.08*thanhTien;
        System.out.println("Tiền VAT (8%): " + String.format("%,.2f", VAT) + " VND");
        System.out.println("Tổng thanh toán: " + String.format("%,.2f", thanhTien - discount + VAT) + " VND");
    }
}
