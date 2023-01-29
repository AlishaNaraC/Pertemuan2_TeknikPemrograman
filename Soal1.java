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
public class Soal1 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);        
        String kalimat =keyboard.nextLine();
        
        String[]A=kalimat.split("[ @?!_,.']+");
        int panjang=A.length;
        System.out.println(panjang);
        for(int i=0;i<panjang;i++){
            System.out.println(A[i]);
                    
        }
    }
}
