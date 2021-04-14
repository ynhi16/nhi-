/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Btthem;

/**
 *
 * @author Admin
 */
public class AllTest {
    int x = 10;
    static int y = 20;

    void m1(int a) {
        System.out.println("Instance method");//number 6
    }

    static void m2(String str) {
        System.out.println("Static method");//number 7
    }

    AllTest() {
        System.out.println("0-arg constructor"); //number 3
    }

    AllTest(int a) {
        System.out.println("1-arg constructor");//number 5
    }

    {
        System.out.println("Instance block");//number 2,4
    }

    static {
        System.out.println("Static block: Nguyễn Văn Phát"); //number 1
    }

    public static void main(String[] args) {
        AllTest at = new AllTest();
        AllTest at2 = new AllTest(10); 
        at.m1(50);
        m2("Shubh"); 
        
    }
}
