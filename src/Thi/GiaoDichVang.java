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
public class GiaoDichVang extends GiaoDich{
    private String loaiVang;
    public void setLoaiVang() {
        this.loaiVang = loaiVang;
    }
    public String getLoaiVang() {
        return loaiVang;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Loai vang ");
        loaiVang = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()+" Loai vang "+getLoaiVang();
    }
    @Override
    public void show(){
        System.out.println(toString());
    }
}

