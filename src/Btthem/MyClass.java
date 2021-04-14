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
public class MyClass {
    static public int X=100;
    static {
        X+=100;
    }
    static public void method() {
        X+=150;
    }
    public static void main(String[] args) {
        MyClass s = new MyClass();
        s.X+=300;
        System.out.println("s.X = "+s.X);
        MyClass.X+=500;
        MyClass.method();
       
        System.out.println("MyClass.X = "+MyClass.X);
    }
}
