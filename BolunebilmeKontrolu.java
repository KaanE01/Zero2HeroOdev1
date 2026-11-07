

package com.mycompany.bolunebilmekontrolu;

import java.util.Scanner;

public class BolunebilmeKontrolu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi giriniz"); // sayı istedik girdi
        int sayi = sc.nextInt();
        
        if( sayi%3==0 & sayi%5==0 ) {
            System.out.println("sayi hem uce hem bese bolunebilir"); //sayı ikisinede bölünüyosa bu çıktı ve bitir
        return;}
        if( sayi%3!=0 & sayi%5!=0 ) {
            System.out.println("sayi hem uce hem bese bolunmüyor"); //sayı ikisinede bölünmüyosa bu çıktı ve bitir
        return;}
        if (sayi % 3 == 0 & sayi % 5 != 0) {
            System.out.println("sayi uce bolunebilir"); //sayı 3 bölünüyorsa sedece bu çıktı ve bitir
        return;}
        if (sayi % 3 != 0 & sayi % 5 == 0) {
            System.out.println("sayi bese bolunebilir"); //sayı 5 bölünüyorsa sedece bu çıktı ve bitir
        return;}
     
    }
}
