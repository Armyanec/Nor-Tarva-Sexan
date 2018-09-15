package com.company.receptner;

import java.util.Scanner;

public class Masivner15 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int input1 = x.nextInt();
        int input2 = x.nextInt();
        System.out.println(input1);
        System.out.println(input2);


//      double p1 = Math.pow(input1,2);
//      double p2 = Math.pow(input2,2);
double sumakvadrataov = Math.pow(input1,2) + Math.pow(input2,2);
double kvadratsuma = Math.pow((input1 + input2),2);
double patasxan;

      if (sumakvadrataov < kvadratsuma){
          patasxan = kvadratsuma;
      }
      else patasxan = sumakvadrataov;
        System.out.println(patasxan);
    }

}
