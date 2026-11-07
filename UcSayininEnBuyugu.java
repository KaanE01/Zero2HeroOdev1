
package com.mycompany.ucsayininenbuyugu;
import java.util.Scanner;
public class UcSayininEnBuyugu {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        System.out.println("sayi biri giriniz"); //s1 iste
        int s1 = sc.nextInt();        
        System.out.println("sayi iki giriniz"); //s2 iste
        int s2 = sc.nextInt();        
        System.out.println("sayi ucu giriniz"); //s3 iste
        int s3 = sc.nextInt();
        
        if(s1>s2 & s1>s3){
            System.out.println("sayi bir en buyuk"); //s1 büyükse çıktıyı çıkar ve durdur
            return;}
        if(s2>s1 & s2>s3){
            System.out.println("sayi iki en buyuk"); //s2 büyükse çıktıyı çıkar ve durdur
            return;}
        if(s3>s1 & s3>s1){
            System.out.println("sayi uc en buyuk"); //s3 büyükse çıktıyı çıkar ve durdur
        } 
        else{
            System.out.println("tüm sayılar eşit"); //hiç biri değilse eşittir yaz 
        }
    }
}
