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
        String m,gabung;
        long jumlah=0,hasil=0;
        
        m=mobil.nextLine();
        gabung=m.replaceAll("\\s", "");
        jumlah=Long.parseLong(gabung);
        hasil=jumlah-999999;
        
        if(hasil%5!=0){
            System.out.println("berhenti");
        }else if(hasil%5==0){
            System.out.println("jalan");
        }
    }
}
