package com.company.receptner;

import java.util.Scanner;

public class Masivner15 {
    public static void main(String[] args) {
//
//        Scanner x = new Scanner(System.in);
//        int input1 = x.nextInt();
//        int input2 = x.nextInt();
//        System.out.println(input1);
//        System.out.println(input2);
//
//
////      double p1 = Math.pow(input1,2);
////      double p2 = Math.pow(input2,2);
//double sumakvadrataov = Math.pow(input1,2) + Math.pow(input2,2);
//double kvadratsuma = Math.pow((input1 + input2),2);
//double patasxan;
//
//      if (sumakvadrataov < kvadratsuma){
//          patasxan = kvadratsuma;
//      }
//      else patasxan = sumakvadrataov;
//        System.out.println(patasxan);

//___________________________________________________________________________________________________
//        Рассчитать надбавку к зарплате за стаж, если стаж от 2 до 5 лет, надбавка составляет 2%,
//        если стаж от 5 до 10 лет - 5%. Ввести с клавиатуры зарплату и стаж, вывести надбавку
//        и сумму к выплате.

        Scanner in = new Scanner(System.in);
        System.out.println("zarplata");
        double zarplata = in.nextInt();
        System.out.println("staj");
        int staj = in.nextInt();

        if (staj > 2 && staj < 5){

            System.out.println(zarplata+((zarplata*2)/100) );
        }
else if (staj>=5 && staj < 10){

            System.out.println( zarplata+((zarplata*5)/100) );
        }



    }

}
