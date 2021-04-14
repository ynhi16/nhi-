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
public interface  Dien {
    int DM1 = 60;
    int DM2 = 100;
    int DM3 = 0;
    int TienDM1 = 600;
    int TienDM2 = 1000;
    int TienDM3 = 2000;
    double Vat = 0.1;
    int tinhTienDM1();
    int tinhTienDM2();
    int tinhTienDM3();
    double tongTien();
}

