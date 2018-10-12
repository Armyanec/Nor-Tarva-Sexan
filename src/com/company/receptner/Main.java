package com.company.receptner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ընտրեք calculator/exchang");
        String vibr = in.next();
        if (vibr.equals("calculator")) {
            Calculator ms = new Calculator();
            System.out.println("CALCULATOR");
            System.out.println("----------");
            System.out.println("ներմուծեք թիվը");
            ms.setInput1();
            System.out.println("ներմուծեք գործողությունը");
            ms.setOperation();
            System.out.println("ներմուծեք թիվը");
            ms.setInput2();
            ms.setPatasxan();
            System.out.println(ms.getPatasxan());
        }

        else {
            if (vibr.equals("exchang")) {
                Exchange chang = new Exchange();
                System.out.println("EXCHANG");
                System.out.println("-------");
                System.out.println("Խնդրում ենք ներմուծել փոխարժույթը dollar/euro/rus");
                chang.setOperation();
                System.out.println(chang.getOperation());
                System.out.println("------");
                System.out.println("ներմուծեք գումարը");
                chang.setInput1();
                chang.setPatasxan();
                System.out.println(chang.getPatasxan() + "\tդրամ");


            }
        }


    }
}
