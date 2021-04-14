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
public class ConGa extends ConVat{
    @Override
    public void TiengKeu() {
        System.out.println("Ò...Ó...O");
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public ConGa() {};

    public ConGa(String ten, String loai, String giong, int sochan) {
        super(ten, loai, giong, sochan);
    }
     
}
