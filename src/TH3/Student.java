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

public class Student extends Person{
    private static final Scanner scanner = new Scanner(System.in);
    String MaSinhVien;
    float DiemTrungBinh;
    String Email;

    @Override
    public void inputInfo(String Ten, String DiaChi, String GioiTinh, String NgaySinh) {
        super.inputInfo(Ten, DiaChi, GioiTinh, NgaySinh);
    }
    
    public void inputInfo(String MaSinhVien, float DiemTrungBinh, String Email){
        this.MaSinhVien=MaSinhVien;
        this.DiemTrungBinh=DiemTrungBinh;
        this.Email=Email;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ma sinh vien : " + MaSinhVien);
        System.out.println("Diem trung binh : " + DiemTrungBinh);
        System.out.println("Email : " + Email);
    }

    public void hocBong() {
        if (DiemTrungBinh > 8) {
            System.out.println("Duoc hoc bong");
        }
    }
    
}
