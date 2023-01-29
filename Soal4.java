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
public class Soal4 {
    public static void main(String args[]){
        Scanner jual=new Scanner(System.in);
        int item;
        float gaji=500000,hitung=0,Tgaji=0,tItem=0;
        item=jual.nextInt();
        
        if(item>80){
            hitung=((item*50000)*35)/100;   //bonus penjualan 35% dari total penjualan
            Tgaji=gaji + hitung;
        }else if(item>=40){
            hitung=((item*50000)*25)/100;   //bonus penjualan sebesar 25% dari total penjualan
            Tgaji=gaji + hitung;
        }else if(item>15 && item<40){       //Selain itu agen hanya menerima bonus 10% setiap itemnya
            tItem=((item*50000)*10)/100;
            Tgaji=gaji+tItem;
        }else if(item<=15){
            hitung=(((15-item)*50000)*15)/100; //pemotongan gajih pokok sebesar 15% dari total minus penjualan ke 15 item
            gaji-=hitung;
            Tgaji=gaji;
        }
        System.out.printf("%.0f\n",Tgaji);
    }
}
