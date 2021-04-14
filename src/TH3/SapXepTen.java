/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TH3;

/**
 *
 * @author Admin
 */

import java.util.Comparator;
public class SapXepTen implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getTen().compareTo(student2.getTen());
    }
}