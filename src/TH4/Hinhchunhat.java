/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH4;

/**
 *
 * @author Admin
 */
public class Hinhchunhat implements HCNInterface{
    int chieudai, chieurong;

    @Override
    public int dientichHCN() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return chieudai*chieurong;
    }

    @Override
    public int getChieuDai() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return chieudai;
    }

    @Override
    public int getChieuRong() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return chieurong;
    }

    @Override
    public void getDaiRong(int cd, int cr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        chieudai=cd;
        chieurong=cr;
    }
    
}

