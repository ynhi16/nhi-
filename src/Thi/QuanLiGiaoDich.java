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

public class QuanLiGiaoDich extends GiaoDich{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("So luong ");
        int n = sc.nextInt();
        GiaoDichVang[] dt = new GiaoDichVang[n];
        for(int i=0; i<n; i++) {
            dt[i] = new GiaoDichVang();
            dt[i].input();
            dt[i].show();
        }
        int max=0;
        for(int i=0; i<n; i++) {
            if (dt[i].thanhTien > max) {
                max = dt[i].getThanhTien();
            }
        }
        System.out.println("Max = "+max);
    }


}