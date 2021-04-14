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
abstract class ConVat {
    String ten,loai,giong;
    int sochan;
    public ConVat(){};
    public ConVat(String ten, String loai, String giong, int sochan) {
        this.ten = ten;
        this.loai = loai;
        this.giong = giong;
        this.sochan = sochan;
    }
    
    public String getTen(){
        return ten;
    }
    public String getLoai(){
        return loai;
    }
    public String getGiong() {
        return giong;
    }
    public int getSoChan() {
        return sochan;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public void setGiong(String giong) {
        this.giong = giong;
    }
    public void setSoChan(int sochan) {
        this.sochan = sochan;
    }
    public String toString() {
        return "Ten: "+getTen()+"\nLoai: "+getLoai()+"\nGiong: "+getGiong()+"\nSo chan: "+getSoChan();
    }
    public void TiengKeu() {};
}
