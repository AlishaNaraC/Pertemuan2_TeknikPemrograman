/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamental1;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Alisha Nara
 */
public class Soal6 {
    public static void main(String args[]){
        Scanner angka=new Scanner(System.in);
        BigInteger A,B;
        A=angka.nextBigInteger();
        B=angka.nextBigInteger();
        
        System.out.println(String.valueOf(A.add(B)));
        System.out.println(String.valueOf(A.multiply(B)));
    }
}
