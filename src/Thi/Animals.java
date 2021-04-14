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
import java.util.*;
public class Animals {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ten,loai,giong;
        int sochan;
        ConGa ga = new ConGa();
        ConMeo meo = new ConMeo();
        System.out.println("Nhap thong tin con ga: ");
        System.out.println("Nhap Ten: ");
        ten = sc.nextLine();
        ga.setTen(ten);
        System.out.println("Nhap Loai: ");
        loai = sc.nextLine();
        ga.setLoai(loai);
        System.out.println("Nhap so chan: ");
        sochan = sc.nextInt();
        ga.setSoChan(sochan);
        System.out.println("Nhap Giong: ");
        sc.nextLine();
        giong = sc.nextLine();
        ga.setLoai(giong);
        System.out.println("Nhap thong tin con meo: ");
        System.out.println("Nhap Ten: ");
        ten = sc.nextLine();
        meo.setTen(ten);
        System.out.println("Nhap Loai: ");
        loai = sc.nextLine();
        meo.setLoai(loai);
        System.out.println("Nhap so chan: ");
        sochan = sc.nextInt();
        meo.setSoChan(sochan);
        System.out.println("Nhap Giong: ");
        sc.nextLine();
        giong = sc.nextLine();
        meo.setLoai(giong);
        
        System.out.println("Thong tin con ga");
        System.out.println(ga.toString());
        ga.TiengKeu();
        System.out.println("Thong tin con meo");
        System.out.println(meo.toString());
        meo.TiengKeu();
    }
   
     
}
