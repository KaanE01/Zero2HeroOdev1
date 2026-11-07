
package com.mycompany.ucgenturubelirleme;

import java.util.Scanner;

public class UcgenTuruBelirleme {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("birinci kenari giriniz"); //k1 aldık
        int k1= sc.nextInt();
        
        System.out.println("ikinci kenari giriniz");  //k2 aldık
        int k2= sc.nextInt();
        
        System.out.println("ucuncu kenari giriniz");  //k3 aldık
        int k3= sc.nextInt();
          
        if (k1+ + k2 < k3 || k3 + k2 < k1 || k1 + k3 < k2 ){  //üçgenin oluşup oluşamazlığını kontrol ettik olusmazsa çıktıyı çıkar ve dur
            System.out.println("bOyle bir ucgen olusamaz");                            
        return;}                                                         
        
        if(k1==k2 & k2==k3 ){
            System.out.println("ucgen eskenar");      // bunlar doğruysa çıtıyı çıkar ve dur
        return;}
        
        if(k1==k2 || k2==k3 || k1==k3 ){
            System.out.println("ucgen ikiz kenar");   // doğruysa çıktıyı çıkar
            
        }else{
            System.out.println("ucgen cesit kenar");  // değilse diğer çıktıyı çıkar
        }
        
        
        
       
        
        
        
        
        
    }
}
