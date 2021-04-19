/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 test2
 */

package Bai4;

/**
 *
 * @author pc
 */
public class Block {
    static int a = 23;
    static int b,max;
    static {
        System.out.println("First Static Block");
        b = 4*a;
    }
    static {
        System.out.println("Second Static Block");
        max = 30;
    }
    public static void display() {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("Max = "+max);
    }
    public static void main(String[] args) {
        display();
    }
}
