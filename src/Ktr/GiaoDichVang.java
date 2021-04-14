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
public class GiaoDichVang extends GiaoDich{
    String loaiVang;
    public String getloaiVang(){
        return loaiVang;
    }
    public void getloaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai vang: ");
        loaiVang = sc.nextLine();
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Loai Vang: "+loaiVang);
    }
}
