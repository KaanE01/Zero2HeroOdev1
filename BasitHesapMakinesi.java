
package com.mycompany.basithesapmakinesi;
import java.util.Scanner;
public class BasitHesapMakinesi {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("bir sayi giriniz"); //sayi istedik
        int s1 = sc.nextInt();
        
        System.out.println("bir sayi daha giriniz"); //birtane dah
        int s2 = sc.nextInt();
        
        System.out.println("islemi giriniz (toplama +, cikarma -, bolme /, carpma *) "); //işlemi istedik
        char islem =sc.next().charAt(0);
        
        if(islem == '/'){
            System.out.println( "sayilarin bolumu"+s1/s2 ); //   / se çıktıyı çıkar ve dur
        return;}
        
        if(islem == '+'){
            System.out.println( "sayilarin toplami"+ (s1+s2 )); //   + ise çıktıyı çıkar ve dur
        return;}
        
        if(islem == '*'){
            System.out.println( "sayilarin carpimi"+s1*s2 ); //    *ise çıktıyı çıkar ve dur
        return;}
        
        if(islem == '-'){  
            System.out.println("sayilarin cikarimi"+(s1-s2));//    - ise çıkar ve çıktıyı çıkar
         
        }
    }
}
