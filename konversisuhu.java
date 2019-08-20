/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naufal.gajendra;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class konversisuhu {
    
    public static void main (String[] args) {
        
        //deklarasi
        double celcius, fahrenheit, suhu;
        
        //membuat scanner baru
        Scanner data = new Scanner (System.in);
        
        //input
        System.out.println("-- Konversi Celcius ke fahrenheit --");
        System.out.print("Input celcius: ");
        celcius = data.nextDouble();
        
     
        //proses
        suhu = (32 + (celcius*9/5));
        
        //output
        System.out.println("suhu: " +suhu);
        
        
       
}
}
