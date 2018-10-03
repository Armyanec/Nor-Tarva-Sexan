//package com.company.receptner;
//
//public class Plan1 {
//    // 1 length
//    // 2 String isEmpty
//
///*
//        String x = "asd";
//        String y = "";
//        System.out.println(x.isEmpty());
//        System.out.println(y.isEmpty());*/
//
////        // 3 charAt
////        String b = "ITHOME";
////        char result = b.charAt(2);//H=2
////        System.out.println(result); //Tpelu a H
//
//    // 4 codePointAt
////        String tox ="Java";
////
////        int retval=tox.codePointAt(0);
////        System.out.println(retval);
//
//    // 5 codePointBefore
//    // 6 codePointCount
//
////        String tox = "Ja va programming language";
////
////        int retval =tox.codePointCount(1,3);
////        System.out.println(retval);
//
//    // 7 offsetByCodePoints
////        String tox = " a a c d e f a a";
////
////        int retval=tox.offsetByCodePoints(4,4);
////        System.out.println("retval " + retval);
//
//    // 8 equals
//        /*String x = "abc";
//        String y = "abc";
//
//        boolean retval = x.equals(y);
//
//        System.out.println(retval);*/
//
//    // 9 contentEquals
//
////        String str1 = "xxx yyy";
////        String str2 = "immutable";
////        String str3 = "(xxx yyy)";
////
////        boolean result = str1.contentEquals(str3);
////        System.out.println(result);
////        result = str2.contentEquals(str3);
////        System.out.println(result);
//
//    // 10 equalsIgnoreCase
////        String x="abc";
////        String y="abc";
////        String z ="ABC";
////
////        boolean retVal;
////
////        retVal=x.equals(y);
////        System.out.println(retVal);
////
////        retVal = x.equalsIgnoreCase(z);
////        System.out.println(retVal);
//
//    // !11 compareTo
////        String str1="A";
////        String str2 ="Z";
////
////        int result=str1.compareTo(str2);
////        System.out.println(result);
//
//    // 12 compareToIgnoreCase  //antesum e mecatar ev poqratar
//
//    // 13 startWith(string )
////
////        String str1 = "Welcome to IT Home";
////        System.out.println(str1.startsWith("Welcome"));
//
//    // 14 endsWith
//
//    // 15 hashcode
//
////        String x= "asdsdfsfsdf";
////        System.out.println(x.hashCode());
//
//    // 16 indexOf
////        String tox = new String("Welcome");
////        System.out.println(tox.indexOf('o')); output is 4
//
//    // 17 lastIndexOf() ;
//
//    // 18 substring
//
////        String tox = "BarevHajox";
////        String nortox =tox.substring(5);
////        System.out.println(tox.substring(5));
//
//    //19 subsequence()
///*
//        String x = "Welcome to ITHOME";
//        System.out.println(x.subSequence(0,10));
//        System.out.println(x.subSequence(5,9));*/
//
//
//    // 20 concat
////        String s = "hello";
////        s = s.concat(" world");
////        s=s.concat(" \nex");
////        System.out.println(s);
//
//    // 21 replace()
//
//        /*String x = "Welcome to word";
//        System.out.println(x.replace('e','i'));*/
//
//    //  22 matches
//
////        String str = "Welcome to ITHOME ";
////        System.out.println(str.matches("(.*)ITHOME"));
////        System.out.println(str.matches("(.*)Welcome(.*)"));
//
//    // 23 contains
//
//    // 24 replaceFirst()
////
////        String str = new String("Welcome to ITHOME");
////        System.out.println(str.replaceFirst("(.*)to(.*)","in"));
//
//    // 25 replaceAll
////        String s = new String("Welcome to Welcome");
////        System.out.println(s.replaceAll("Welcome", "x"));
//
//    // 26 split()
////        String str = "Welcome-to--it-home";
////        for (String retVal : str.split("--")) {
////            System.out.println(retVal + " ");
////        }
//
//    // 27 toUpperCase
//    // 28 toLowerCase
//
//    // 29 trim()
//
////        String x = "    Java is awesome        ";
////        System.out.println(x.trim());
//
//    // 30 toString()
//
//    // 31 toCharArray
//
////        String x = "Welcome to main class";
////        for (char charArray: x.toCharArray()){
////            System.out.print(charArray+"-");
////        }
//
//    // 32 valueOf()
//
////        int value = 65;
////        String s1 = String.valueOf(value);
////        System.out.println(s1+20);
//
//    // 33 copyValueOf()
//
////        char[] x = {'a', 'b', 'c'};
////        String tox = "";
////        tox = tox.copyValueOf(x);
////        System.out.println("Veradardz = " + tox);
//
//       /* String x = "123";
//        int y = Integer.parseInt(x);
//        System.out.println(y + 3);*/
//
////}
//
//CHAR
// String str = "asd123";
//         int num = 0;
//         for (int i = 0; i < str.length(); i++) {
//
//        if (Character.isDigit(str.charAt(i))){
//        num ++;
//        }
//        }
//
//        System.out.println(num); // patasxan 3
//
////        xndir
////static void N193() {
//
//        String str = "Bubble    TB sfdg      561      BBB      B BBBBB";
//        for (int i = 0; i < str.length(); i++) {
//        str = str.replaceAll("  ", " ");
//        }
//        String bar[] = str.split(" ");
//        int count = 0;
//        int quantity = 0;
//        str = "";
//        for (int i = 0; i < bar.length; i++) {
//        count = 0;
//        for (int j = 0; j < bar[i].length(); j++) {
//        if (bar[i].charAt(j) == 'B') {
//        count++;
//        }
//        }
//        if (count > 0) {
//        quantity++;
//        System.out.println(bar[i] + " " + count);
//        }
//        }
//        System.out.println(quantity);
//
//
//}
//