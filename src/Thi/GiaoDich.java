/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thi;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class GiaoDich {
    String magd;
    String b;
    String c;
    String donGia;
    int thanhTien;

    GiaoDich() {
        super();
    }
    GiaoDich(String magd, String b, String c, String donGia, int thanhTien) {
        super();
        this.magd = magd;
        this.b = b;
        this.c = c;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public void setMagd() {
        this.magd = magd;
    }
    public String getMagd() {
        return  magd;
    }
    public void setb() {
        this.b = b;
    }
    public String getB() {
        return  b;
    }
    public void setc() {
        this.c = c;
    }
    public String getC() {
        return  c;
    }
    public void setDonGia() {
        this.donGia = donGia;
    }
    public String getDonGia() {
        return  donGia;
    }
    public void setThanhTien() {
        this.thanhTien= thanhTien;
    }
    public int getThanhTien() {
        return  thanhTien;
    }

    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ma giao dich ");
        magd = sc.nextLine();
        System.out.println("b ");
        b = sc.nextLine();
        System.out.println("c ");
        c = sc.nextLine();
        System.out.println("Don gia ");
        donGia = sc.nextLine();
        System.out.println("Thanh tien ");
        thanhTien = sc.nextInt();
    }
    public String toString() {
        return "Ma giao dich: "+getMagd()+" b "+getB()+" c "+getC()+" Don gia "+getDonGia()+" Thanh tien "+getThanhTien();
    }

    public void show() {
        System.out.println(toString());
    }

}

