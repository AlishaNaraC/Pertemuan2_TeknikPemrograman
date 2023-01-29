/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamental1;
import java.util.Scanner;
/**
 *
 * @author Alisha Nara
 */
public class Soal5 {
    public static void main(String args[]){
        Scanner mobil=new Scanner(System.in);
        int m1,m2,m3,m4,jumlah=0,hasil=0;
        
        m1=mobil.nextInt();
        m2=mobil.nextInt();
        m3=mobil.nextInt();
        m4=mobil.nextInt();
        
        jumlah=sum(m1,m2,m3,m4);
        hasil=999999-jumlah;
        System.out.println(hasil);
        if(hasil%5!=0){
            System.out.println("jalan");
        }else if(hasil%5==0){
            System.out.println("berhenti");
        }
        
    }

    private static int sum(int m1, int m2, int m3, int m4) {
        return(m1+m2+m3+m4);
    }
}
