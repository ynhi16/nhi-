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

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Person {
    private static final Scanner scanner = new Scanner(System.in);
    
    public String Ten, DiaChi, GioiTinh, NgaySinh;
    
    //constructor
    
    

    public String getTen() {
        return Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void inputInfo(String Ten, String DiaChi, String GioiTinh, String NgaySinh){
        this.Ten=Ten;
        this.DiaChi=DiaChi;
        this.GioiTinh=GioiTinh;
        this.NgaySinh=NgaySinh;
    }
    
    public void showInfo(){
        System.out.println("Ho ten: "+Ten);
        System.out.println("Dia Chi: "+DiaChi);
        System.out.println("Gioi Tinh: "+GioiTinh);
        System.out.println("Ngay Sinh: "+NgaySinh);
    } 
}

