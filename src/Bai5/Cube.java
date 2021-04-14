/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai5;

/**
 *
 * @author pc
 */
public class Cube {
    public static double calCube(float a) {
        double V;
        V = a*a*a;
        return V;
    }
    public static void main(String[] args) {
        double V = calCube((float) 3.5);
        System.out.println("V = "+V);
    }
}
