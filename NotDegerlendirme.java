package com.mycompany.notdegerlendirme;

import java.util.Scanner;

public class NotDegerlendirme {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ogrencnin puanini giriniz");
        int puan =sc.nextInt();
        
        if( puan >=90 & puan <=100){
            System.out.println("ogrencinin notu AA"); //not 90le 100 arasındaysa aa yaz ve bitir
            return;}
    
        if( puan >=80 & puan <=89){
            System.out.println("ogrencinin notu BA"); //not 80le 89 arasındaysa ba yaz ve bitir
            return;}
    
        if( puan >=70 & puan <=79){
            System.out.println("ogrencinin notu BB"); //not 70le 79 arasındaysa bb yaz ve bitir
            return;}
        
        if( puan >=60 & puan <=69){
            System.out.println("ogrencinin notu CB"); //not 60le 69 arasındaysa cb yaz ve bitir
            return;}
        
        if( puan >=50 & puan <=59){
            System.out.println("ogrencinin notu CC"); //not 50le 59 arasındaysa cc yaz ve bitir
            return;}
        
        if( puan >=0 & puan <=49){
            System.out.println("ogrencinin notu FF"); //not 0la 49 arasındaysa ff yaz ve bitir
            return;}
        
        if( puan <0  || puan > 100){                    //not 1 le 100 arasında değilse çıktıyı çıkar ve bitir
            System.out.println("boyle bir puan yoktur ogrencinin notunu dogru girdiginizden emin olun");
            return;}
   
    }
}
