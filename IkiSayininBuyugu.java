
package com.mycompany.ikisayininbuyugu;

import java.util.Scanner ;

public class IkiSayininBuyugu {
   
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in); 
        System.out.println("Sayi biri giriniz");                    //sayi 1 istedik girdi
        int s1 = sc.nextInt();
        
        System.out.println("Sayi ikiyi giriniz");                   //sayi iki istedik girdi
        int s2 = sc.nextInt();
        
        if(s1>s2){
            System.out.println("sayi bir sayi ikiden buyuktur");    //s1 büyükse çıktı çıkar durdur
        return;
        }
        if(s2>s1){
            System.out.println("sayi iki sayi birden buyuktur");    //s2 büyükse çıktı çıkar
        }
        else{
            System.out.println("girdiginiz sayilar ayni");          //değilde eşit yazdır 
        }
     
    }
}
