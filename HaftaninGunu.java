

package com.mycompany.haftaningunu;

import java.util.Scanner;

public class HaftaninGunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-7 arasinda sayi giriniz 1 ve 7 de dahildir"); // sayı istedik
        int gun = sc.nextInt();
        
        if(gun <= 1 || gun >=7){
            System.out.println("girdiginiz sayi bu aralikta degildir"); //eledik sayılar
        return;}
        
        switch (gun){
            
            case 1:{
                System.out.println("gun pazartesi"); //sayı birse çıktı çıkar ve dur
            return;}
             
            case 2:{
                System.out.println("gun sali"); //sayı ikiyse çıktı çıkar ve dur
            return;}
        
            case 3:{
                 System.out.println("gun carsamba"); //sayı üçse çıktı çıkar ve dur
            return;}
        
            case 4:{
                System.out.println("gun persembe"); //sayı dörtse çıktı çıkar ve dur
            return;}
        
            case 5:{
                System.out.println("gun cuma"); //sayı beşse çıktı çıkar ve dur
            return;}    
                
            case 6:{
                System.out.println("gun cumartesi"); //sayı altıysa çıktı çıkar ve dur
            return;}    
                
            case 7:{
                System.out.println("gun pazar"); //sayı yediyse çıktı çıkar ve dur
                
            return;}    
                
        
        
        }
    }
}
