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

public class DienTieuThu implements Dien{  
    int sc, csm, csc;

    DienTieuThu() {
        
    }
    @Override
    public int tinhTienDM1() {
        sc = csm - csc;
        return sc * DM1;
    }

    @Override
    public int tinhTienDM2() {
        sc = csm - csc;
        return sc*DM2;
    }

    @Override
    public int tinhTienDM3() {
        sc = csm - csc;
	return sc*DM3;
    }

    @Override
    public double tongTien() {
        sc = csm - csc;
        if (sc <= 60)
                return tinhTienDM1() * Vat + tinhTienDM1();
        else if (sc <= 100)
                return tinhTienDM2() * Vat + tinhTienDM2();
        return tinhTienDM3() * Vat + tinhTienDM3();
    }
    public DienTieuThu(int csm, int csc) {
        this.csm = csm;
        this.csc = csc;
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    public int getCsm() {
        return csm;
    }

    public void setCsm(int csm) {
        this.csm = csm;
    }

    public int getCsc() {
        return csc;
    }

    public void setCsc(int csc) {
        this.csc = csc;
    }

   
      
}
