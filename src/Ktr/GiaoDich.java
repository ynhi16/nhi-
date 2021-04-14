/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ktr;

/**
 *
 * @author Admin
 */
import java.util.*;
public class GiaoDich {
    String magd;
    String donGia;
    int thanhTien;
    GiaoDich(){
        super();
    }
    GiaoDich(String magd,String b,String c,String donGia,int thanhTien) {
        super();
        this.magd = magd;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }
    public String getMagd(){
        return magd;
    }
    public void setMagd(String magd) {
        this.magd = magd;
    }
    public String getdonGia(){
        return donGia;
    }
    public void setdonGia(String magd) {
        this.donGia = donGia;
    }
    public int getthanhTien(){
        return thanhTien;
    }
    public void setthanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma don hang: ");
        magd = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextLine();
        System.out.println("Nhap Thanh Tien: ");
        thanhTien = sc.nextInt();
    }
    public void show() {
        System.out.println("Ma Don Hang: "+magd);
        System.out.println("Don Hang: "+donGia);
        System.out.println("Thanh Tien: "+thanhTien);
    }
}
