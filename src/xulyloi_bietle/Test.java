/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulyloi_bietle;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test extends DienTieuThu{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        try {
            System.out.println("Nhap chi so moi");
            int csmoi = scanner.nextInt();
            System.out.println(csmoi);
            System.out.println("Nhap chi so cu");
            int cscu = scanner.nextInt();
            if (csmoi < cscu) {
                    throw new Exception();
            }
        } catch(Exception e) {
            System.out.println("Gap loi!");
            
        }
        DienTieuThu dt = new DienTieuThu(); 
        System.out.println("DM1: "+dt.tinhTienDM1());
        System.out.println("DM2: "+dt.tinhTienDM2());
        System.out.println("DM3: "+dt.tinhTienDM3());
        System.out.println("Tong Tien: "+dt.tongTien());
    }
}
