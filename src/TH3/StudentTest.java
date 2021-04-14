/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH3;

/**
 *
 * @author Admin
 */
import java.util.*;
public class StudentTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số sinh viên: ");
        int n = scanner.nextInt();
        Student student[] = new Student[n];
        for(int i=0; i<n; i++){
            String Ten, ma, gioi, ngay, dc, mail, tg;
            float diem;
            student[i] = new Student();
            System.out.println("Sinh viên thứ "+(i+1));
            tg=scanner.nextLine();
            System.out.println("Họ tên: ");
            Ten=scanner.nextLine();
            System.out.println("Mã sv: ");
            ma=scanner.nextLine();
            System.out.println("Email: ");
            mail=scanner.nextLine();
            System.out.println("Dịa Chỉ: ");
            dc=scanner.nextLine();
            System.out.println("Ngày Sinh: ");
            ngay=scanner.nextLine();
            System.out.println("Giới Tính: ");
            gioi=scanner.nextLine();
            System.out.println("Điểm Trung Bình: ");
            diem=scanner.nextFloat();
            student[i].inputInfo(ma, diem, mail);
            student[i].inputInfo(Ten, dc, gioi, ngay);
        }
        for(int i=0; i<n ; i++){
            student[i].showInfo();
            System.out.println("---------");
        }
        float max=0, min=10;
        for(int i=0; i<n; i++){
            if(student[i].DiemTrungBinh>max)
                max=(float) student[i].DiemTrungBinh;
            if(student[i].DiemTrungBinh<min)
                min=(float) student[i].DiemTrungBinh;
        }
        System.out.println("Hs co diem cao nhat: "+max);
        System.out.println("Hs co diem thap nhat: "+min);
        String tg2;
        tg2=scanner.nextLine();
        System.out.println("Nhap ma sinh vien can tim: ");
        String ma = scanner.nextLine();
        int flag = 1;
        
        for (int i = 0; i < n; i++) {
            if (ma.equals(student[i].MaSinhVien) == true) {
                flag = 2;
                student[i].showInfo();
                System.out.println("---------");
            }
        }
        if (flag == 1) {
            System.out.println("Khong co sinh vien nao.");
        }
        System.out.println("Danh sách học bổng: ");
        for (int i = 0; i < n; i++) {
            if(student[i].DiemTrungBinh>8){
                student[i].showInfo();
                System.out.println("---------");
            }
        }
    }
}



