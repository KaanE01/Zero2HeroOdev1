
package com.mycompany.pozitifnegatifveyasifir;

import java.util.Scanner;
public class PozitifNegatifveyaSifir {

    public static void main(String[] args) {
        
       Scanner sc =new Scanner(System.in);
       
        System.out.println("sayi giriniz");       //sayı istedik ve aldık
        int sayi = sc.nextInt();
        
        if(sayi>0){;
        System.out.println("sayi pozitif");       //sayı sıfırdan büyükse çıktı çıkar ve kapan
        return;
        }
        
        if (sayi<0 ){;
            System.out.println("sayi negatif");   //sayı sıfırdan küçükse çıktıyı çıkar
        }
        
        else{
            System.out.println("sayi noturdur");  //değiilse nötür yaz
        }
        
        
    }
}
