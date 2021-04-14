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
public class ConMeo extends ConVat{
    @Override
    public void TiengKeu() {
        System.out.println("Meo..meo..meo");
    }
    @Override 
    public String toString() {
        return super.toString();
    }

    public ConMeo() {
    }

    public ConMeo(String ten, String loai, String giong, int sochan) {
        super(ten, loai, giong, sochan);
    }
    
}
