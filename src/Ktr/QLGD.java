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
public class QLGD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So Luong: ");
        int n = sc.nextInt();
        GiaoDichVang dt[] = new GiaoDichVang[n];
        for(int i=0;i<n;i++) {
            System.out.println("Nhap don hang so "+(i+1));
            dt[i] = new GiaoDichVang();
            dt[i].input();
        }
        for(int i=0;i<n;i++) {
            dt[i].show();
        }
        int max = 0;
        for(int i=0;i<n;i++) {
            if(dt[i].thanhTien>max)
                max = dt[i].thanhTien;
        }
        System.out.println("Max = "+max);
    }
}
