/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulyloi_bietle;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Mang {

    private static final Scanner sc = new Scanner(System.in);

    public void nhap(int a[], int n, int i) {
        for (; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            try {
                a[i] = sc.nextInt();
                if (a[i] == 100) {
                    throw new Exception();
                }
            } catch (Exception e) {
                i--;
                break;
            }
        }
        
        try{
            System.out.println("Phan tu da nhap: ");
            for (int t = 0; t <= i; t++) {
            System.out.print(a[t] + "\t");}}
        catch(Exception e){}
        
    }

    public void chia(float a, float b) {
        try {
            if (b == 0) {
                throw new Exception();
            }
            System.out.println(a + "/" + b + "=" + (a / b));
        } catch (Exception e) {
            System.out.println("Gap loi!");
        }
    }

    public static void main(String[] a) {
        Mang dt = new Mang();
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0;
        dt.nhap(arr, n, i);
        System.out.println("\n");
        float x = 0, y = 0;
        System.out.println("\n------------------\nNhap 2 so thuc: ");
        try {
            x = sc.nextFloat();
            y = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Gap loi!");
        }
        dt.chia(x, y);
    }
}

