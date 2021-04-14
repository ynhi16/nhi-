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
import java.util.Scanner;
public class HCNTest extends Hinhchunhat{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int max=0, dai = 0, rong=0;
        System.out.println("Nhap so hinh chu nhat: ");
        int n = scanner.nextInt();
        Hinhchunhat hcn[] = new Hinhchunhat[n];
        for(int i=0; i<n; i++){
            hcn[i] = new Hinhchunhat();
            int d, r;
            System.out.println("Nhap chieu dai va chieu rong: ");
            d = scanner.nextInt();
            r = scanner.nextInt();
            hcn[i].getDaiRong(d, r);            
        }
        for(int i=0; i<n; i++){
            
            System.out.println("Chieu dai: "+hcn[i].getChieuDai());
            System.out.println("Chieu rong: "+hcn[i].getChieuRong());
            System.out.println("Dien tich : "+hcn[i].dientichHCN());
            System.out.println("---");
            if(hcn[i].dientichHCN()>max){
                max=hcn[i].dientichHCN();
                dai=hcn[i].chieudai;
                rong=hcn[i].chieurong;}
        }
        System.out.println("Dien tich max: "+max+"\nDai: "+dai+"\nRong: "+rong);
    }
}

