/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai6;

/**
 *
 * @author pc
 */
public class MethodTest {
    static int a = 10;
    void display() {
         System.out.println("This is an instance method");
    }
    static void show() {
        System.out.println("This is a Static method");
   
    }
    public static void main(String[] args) {
        show();
        System.out.println("a = "+a);
        MethodTest s = new MethodTest();
        s.display();
    }
}
