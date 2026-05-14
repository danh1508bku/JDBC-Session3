import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int stuNum = 0;
        float diemCaoNhat = 0;
        float diemThapNhat = 10;
        float tongDiem = 0;
        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());


            switch (choice) {
                case 1:
                    System.out.print("\n--- Nhập điểm học viên (nhập -1 để dừng) ---");
                    float diem;
                    do {
                        System.out.print("\nNhập điểm: ");
                        diem = Float.parseFloat(sc.nextLine());

                        if (diem == -1) {
                            break;
                        }

                        if (diem >= 0 && diem < 5) {
                            stuNum += 1;
                            tongDiem += diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                            System.out.println("Học lực: Yếu");
                        } else if (diem >= 5 && diem < 7) {
                            stuNum += 1;
                            tongDiem += diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                            System.out.println("Học lực: Trung Bình");
                        } else if (diem >= 7 && diem < 8) {
                            stuNum += 1;
                            tongDiem += diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                            System.out.println("Học lực: Khá");
                        } else if (diem >= 8 && diem < 9) {
                            stuNum += 1;
                            tongDiem += diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                            System.out.println("Học lực: Giỏi");
                        } else if (diem >= 9 && diem <= 10) {
                            stuNum += 1;
                            tongDiem += diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                            System.out.println("Học lực: Xuất Sắc");
                        }

                        if (diem < 0 || diem > 10) {
                            System.err.print("\nĐiểm không hợp lệ. Nhập lại.");
                        }

                    } while (diem != -1);
                    break;
                case 2:
                    System.out.println("--- KẾT QUẢ ---");
                    System.out.printf("Số học viên đã nhập: %d", stuNum);
                    System.out.printf("\nĐiểm trung bình: %.2f", tongDiem / stuNum);
                    System.out.printf("\nĐiểm cao nhất: %.2f", diemCaoNhat);
                    System.out.printf("\nĐiểm thấp nhất: %.2f\n", diemThapNhat);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);

            }
        } while (true);
    }
}
