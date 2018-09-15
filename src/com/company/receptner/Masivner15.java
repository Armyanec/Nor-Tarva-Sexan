package com.company.receptner;

import java.util.Arrays;
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


        Scanner f = new Scanner(System.in);
        float[] masiv = new float[3];
        masiv[0] = f.nextFloat();
        masiv[1] = f.nextFloat();
        masiv[2] = f.nextFloat();


        for (int i = 0; i < masiv.length; i++) {

            float temp = masiv[i];

            for (int j = 0; j < masiv.length; j++) {

                if (masiv[i] > masiv[j]){
                    masiv[i] = masiv[j];
                    masiv[j] = temp;
                    System.out.println(Arrays.toString(masiv));

                }


              }


            }


        float a = masiv[0];
        float b = masiv[1];
        float c = masiv[2];
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {

            System.out.println("uxankyun erankyun");

        } else System.out.println("uxankyun erankyun chi");
                 }
             }

