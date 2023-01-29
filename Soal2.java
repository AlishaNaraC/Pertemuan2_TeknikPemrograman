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
public class Soal2 {
     public static void main(String args[]){
        Scanner kata=new Scanner(System.in);
        String s1,s2,s3;
        int x,y,z;
        
        s1=kata.next();
        x=kata.nextInt();
        
        s2=kata.next();
        y=kata.nextInt();
        
        s3=kata.next();
        z=kata.nextInt();
        
        System.out.println("===============");
        System.out.printf("%-15s%03d%n",s1,x);
        System.out.printf("%-15s%03d%n",s2,y);
        System.out.printf("%-15s%03d%n",s3,z);
        System.out.println("===============");
    }
}