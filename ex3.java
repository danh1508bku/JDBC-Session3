import java.util.Scanner;

public class ex3 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empNum = 0;
        int tongLuong =0;
        int maxSalary = 0;
        int minSalary = 500000000;
        int tienThuong = 0;
        do{
            System.out.println("\n********** MENU NHẬP LƯƠNG **********");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("\n----- Nhập lương nhân viên (-1 để kết thúc) -----");
                    do {
                        System.out.print("Nhập lương: ");
                        int luong = Integer.parseInt(sc.nextLine());
                        if(luong == -1){break;}
                        else if(luong < 0 || luong > 500000000){
                            System.out.println("Lương không hợp lệ. Nhập lại");
                        }
                        else{
                            if(luong<5000000){
                                System.out.println("Phân loại: Thấp");
                                empNum+=1;
                                tongLuong+=luong;
                                if(luong>maxSalary){maxSalary=luong;}
                                if(luong<minSalary){minSalary=luong;}
                                tienThuong+=(luong*0.05);
                            }
                            else if(luong<15000000){
                                System.out.println("Phân loại: Trung bình");
                                empNum+=1;
                                tongLuong+=luong;
                                if(luong>maxSalary){maxSalary=luong;}
                                if(luong<minSalary){minSalary=luong;}
                                tienThuong+=(luong*0.1);
                            }
                            else if(luong<50000000){
                                System.out.println("Phân loại: Khá");
                                empNum+=1;
                                tongLuong+=luong;
                                if(luong>maxSalary){maxSalary=luong;}
                                if(luong<minSalary){minSalary=luong;}
                                tienThuong+=(luong*0.15);
                            }
                            else {
                                System.out.println("Phân loại: Cao");
                                empNum+=1;
                                tongLuong+=luong;
                                if(luong>maxSalary){maxSalary=luong;}
                                if(luong<minSalary){minSalary=luong;}
                                if(luong>=100000000){tienThuong+=(luong*0.25);}
                                else { tienThuong+=(luong*0.2);}
                            }
                        }
                    } while(true);
                    break;
                case 2:
                    System.out.println("--- Thống kê ---");
                    if(empNum==0){
                        System.err.println("Chưa có dữ liệu");
                    }
                    else{
                        
                        System.out.printf("Số nhân viên: %d", empNum);
                        System.out.printf("\nTổng lương: %,d VND", tongLuong);
                        System.out.printf("\nLương trung bình: %,d VND", tongLuong/empNum);
                        System.out.printf("\nLương cao nhất: %,d VND", maxSalary);
                        System.out.printf("\nLương thấp nhất: %,d VND\n", minSalary);
                    }
                    break;
                case 3:
                    System.out.println("--- Tính tổng số tiền thưởng nhân viên ---");
                    System.out.printf("Tổng tiền thưởng nhân viên: %,d VND\n", tienThuong);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
            }
        } while (true);
    }
}
