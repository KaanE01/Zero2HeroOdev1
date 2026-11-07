
package com.mycompany.artikyilkontrolu;

import java.util.Scanner;

public class ArtikYilKontrolu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("istediginiz yili giriniz"); //yıl istedik ve yıl girdik
        int yil =sc.nextInt();
        
        if(yil % 4== 0){ 
            System.out.println("girdiginiz yil artik yildir"); // yıl dörde bölünebiliniyorse artık yıl de
        }
        else{
            System.out.println("girdiginiz yil artik yil degildir"); // değilse artık yıl değildir de
        }
    }
}
