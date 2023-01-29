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
public class Soal3 {
    public static void main(String args[]){
        Scanner hitung=new Scanner(System.in);
        
        int A=hitung.nextInt();
        String op=hitung.next();
        int B=hitung.nextInt();
        
        int C = 0;
        if(A>=1 && B<=1000){
        switch (op) {
            case "+" -> C=A+B;
            case "-" -> C=A-B;
            case "*" -> C=A*B;
            case "/" -> C=A/B;
            case "%" -> C=A%B;
            default -> {
            }
        }
        }
        System.out.println(C);
    }
}
