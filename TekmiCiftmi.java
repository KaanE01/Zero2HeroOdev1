package com.mycompany.tekmiciftmi;
import java.util.Scanner;

public class TekmiCiftmi {

    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          
          System.out.println("Bir sayi giriniz");//sayi aldık
          int x29 =sc.nextInt();
          
          if(x29%2==1){
              System.out.println("sayi tek");} //sayi tekse tek yaz
          else{
        System.out.println("sayi cift");} //değilse çift yaz
}
}