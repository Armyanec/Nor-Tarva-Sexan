package com.company.receptner;

import java.util.ArrayList;
import java.util.List;
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

//        Scanner in = new Scanner(System.in);
//        System.out.println("zarplata");
//        double zarplata = in.nextInt();
//        System.out.println("staj");
//        int staj = in.nextInt();
//
//        if (staj > 2 && staj < 5){
//
//            System.out.println(zarplata+((zarplata*2)/100) );
//        }
//else if (staj>=5 && staj < 10){
//
//            System.out.println( zarplata+((zarplata*5)/100) );
//        }

//_____________________________________________________
//    Ввести с клавиатуры значения трех сторон треугольника a, b и c и
//    определить, является ли он прямоугольным. Ответ вывести в виде сообщения.
        List<Float> masiv = new ArrayList <Float>();

        Scanner f = new Scanner(System.in);

        float x = f.nextInt();
        masiv.add(x);
        float y = f.nextInt();
        masiv.add(y);
        float z = f.nextInt();
        masiv.add(z);


        for (int i = 0; i < masiv.size(); i++) {


            for (int j = 0; j < masiv.size(); j++) {


                if (masiv.get(i) > masiv.get(j)){
                    masiv.get(i) = masiv.get(j);
                }


            }
        }


                     if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {

                         System.out.println("uxankyun erankyun");

                     } else System.out.println("uxankyun erankyun chi");

                 }
             }

