package com.company.receptner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//   Plane plane = new Plane();
//   plane.setCount(10);
//   plane.setTitle("gir");
//   plane.setSpeed(120);
//
//        System.out.println(plane.getSpeed());
//        System.out.println(plane.getCount());

//____________________________________________________________________________________________________
//1.
//int a = 5, b = 11, c = 30;
//int sum = 0;
//if (a > b || a > c){
//    sum = a;
//}
//        if (b > a || b > c){
//            sum = c;
//        }
//if (c > a || c > b){
//    sum = c;
//}
//        System.out.println(sum);

//_________________________________
        //2.
        //int a = 5, b = 11, c = 30;
//int sum = 0;
//if (a < b || a < c){
//    sum = a;
//}
//        if (b < a || b < c){
//            sum = c;
//        }
//if (c < a || c < b){
//    sum = c;
//}
//        System.out.println(sum);


//3. ______________________________
//
//     int a = 1, b = 5, c = 0;
//
//     if (a == 1 || b == 1 || c == 1){
//
//     }
//    else x = false;
//        System.out.println(x);


//4. ______________________________________

//int a = 2, b = 1, c = 2;
//
//boolean x = true;
//if (a == 2 && b == 2){
//
//}
//        if (b == 2 && c == 2){
//
//        }
//if (a == 2 && c ==2){
//
//}
//else
//    x = false;
//
//
//        System.out.println(x);


        //5.________________________________

//  int a = 1, b = 1, c = 5;
//int y = 0;
//int cos = a/b;
//if ( (a + b) > c && (a + c) > b ) {
//
//      y = 1;
//  }
//else   y = 2;
//
//        System.out.println(y);


        // 6. ____________________
//
//float a = 8, b = 3 , c = 5;
//
//int x = 0;
//if ( (a % 2) == 0){
//    x = 1;
//}
//if ( (b % 2) == 0){
//    x = 1;
//}
//if ( (c % 2 ) == 0){
//    x = 1;
//}
//else if (x != 1){
//    x = 2;
//}
//
//        System.out.println(x);


// 7. __________________________
//        int a = 4, b = 5, c = 10;
//
//        boolean x = true;
//
//        if (a + b) == c ){
//            x = true;
//        }
//    else  x = false;
//
//        System.out.println(x);

// 8. __________________________________

//    int a = 3, b = 4, c = 12;
//
//boolean x = true;
//if ((a * b) == c){
//    x = true;
//}
//
//else  x = false;
//
//        System.out.println(x);

// 9. _________________________________________
//
//    int a = 1, b = 9, c = 0;
//
//if (a > b){
//    int temp = a;
//    a = b;
//    b = temp;
//}
//if (a > c){
//    int temp = a;
//    a = c;
//    c = temp;
//}
//
//if (b > c){
//    int temp = b;
//    b = c;
//    c = temp;
//}
//        System.out.println(a + "  " + b + "  " + c);


// 10. _________________________________________
//
//    int a = 1, b = 9, c = 0;
//
//if (a < b){
//    int temp = a;
//    a = b;
//    b = temp;
//}
//if (a < c){
//    int temp = a;
//    a = c;
//    c = temp;
//}
//
//if (b < c){
//    int temp = b;
//    b = c;
//    c = temp;
//}
//        System.out.println(a + "  " + b + "  " + c);

// 11. _________________________________________
//     int a = 33, b = 5, c = 8, d = 22;
//
//     if (a > b){
//         int temp = a;
//         a = b;
//         b = temp;
//     }
//     if (b > c){
//         int temp = b;
//         b = c;
//         c = temp;
//     }
//       if (c > d){
//           int temp = c;
//           c = d;
//           d = temp;
//       }
//        System.out.println(d);

// 12. _________________________________________

//        int a = 33, b = 5, c = 8, d = 22;
//
//        if (a < b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        if (b < c){
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//        if (c < d){
//            int temp = c;
//            c = d;
//            d = temp;
//        }
//        System.out.println(d);

// 13. _________________________________________

//        int a = 5, b = 2, c = 3;
//
//        boolean x = false;
//
//        if (a == 1 || b == 1 || c == 1){
//            x = true;
//            System.out.println(x);
//        }
//else if (x != true){
//            System.out.println(x);
//        }

// 14. _________________________________________

//        int a = 5, b = 2, c = 4, d = 1;
//
//        boolean x = false;
//
//        if ((a + b) == (c + d)){
//            x = true;
//        }
//        if ((a + c) == (b + d)){
//            x = true;
//        }
//    if ((a + d) == (c + b)){
//        x = true;
//    }
//    else if (x != true) {
//        x = false;
//    }
//
//        System.out.println(x);


// 15. _________________________________________

//        int a = 5, b = 10, c = 2, d = 1;
//
//        boolean x = false;
//
//        if (a == (b + c +d)){
//            x = true;
//        }
//        if (b == (a + c + d)){
//            x = true;
//        }
//        if (c == (a + b + d)){
//            x = true;
//        }
//
//        if (d == (a + b + c)){
//            x = true;
//        }
//        else if (x != true){
//            x = false;
//        }
//
//        System.out.println(x);


// 16. _________________________________________

//        int a = 5, b = 1, c = 4, d = 1;
//int x = 0;
//        if (a % 2 == 0 && b % 2 == 0){
//            x = 1;
//        }
//    if (a % 2 == 0 && c % 2 == 0 ){
//        x = 1;
//    }
//    if (a % 2 == 0 && d % 2 ==0){
//        x = 1;
//    }
//
//        if (b % 2 == 0 && c % 2 == 0){
//            x = 1;
//        }
//        if (b % 2 == 0 && d % 2 == 0 ){
//            x = 1;
//        }
//        if (c % 2 == 0 && d % 2 ==0){
//            x = 1;
//        }
//    else  if (x != 1){
//        x = 2;
//        }
//
//        System.out.println(x);

// 17. _________________________________________

//       int a = 1, b = 8, c = 3, d = 5;
//boolean x = false;
//       if ((a + b) == c && (b + c) == d ){
//           x = true;
//       }
//else  x = false;
//
//        System.out.println(x);


// 18. _________________________________________


//       int a = 1, b = 2, c = 2, d = 4;
//boolean x = false;
//       if ((a * b) == c && (b * c) == d ){
//           x = true;
//       }
//else  x = false;
//
//        System.out.println(x);

// 19. _________________________________________

//        int a = 1, b = 8, c = 2, d = 4;
//
//        if (a > b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        if (b > c){
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//
//        if (c > d){
//            int temp = c;
//            c = d;
//            d = temp;
//        }
//        System.out.println(a + " " + b + " " + c + " " + d);

// 20. _________________________________________
//        int a = 1, b = 8, c = 2, d = 4;
//
//        if (a < b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        if (b < c){
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//
//        if (c < d){
//            int temp = c;
//            c = d;
//            d = temp;
//        }
//
//        if ( b < c){
//            int temp = b;
//            b = c;
//            c = temp;
//
//
//        }
//        System.out.println(a + " " + b + " " + c + " " + d);


// 21. _________________________________________
//        boolean t ;
//       int eranish = 123;
//       int miavor = eranish%10;
//       int tasnavor = eranish/10%10;
//       int haryuravor = eranish/100;
//
//       if (tasnavor + haryuravor == miavor){
//           t = true;
//
//       }
//        else t = false;
//
//
//        System.out.println(t);


// 22. _________________________________________

//       boolean t = false;
//       int eranish = 122;
//       int miavor = eranish%10;
//       int tasnavor = eranish/10%10;
//       int haryuravor = eranish/100;
//
//      t = (miavor == tasnavor || tasnavor == haryuravor || miavor == haryuravor);

// 23. _________________________________________

//    int eranish = 123;
//    int a = eranish%10;
//    int b = eranish/10%10;
//    int c = eranish/100;
//    int K = 10;
//    float gumar_Haraberutyun = eranish/(a + b + c);
//    float miavor_Haraberutyun = eranish/a;
//
//    if (gumar_Haraberutyun > K){
//        System.out.println(gumar_Haraberutyun + "\tgumar_Haraberutyun");
//    }
//else System.out.println(miavor_Haraberutyun + "\tmiavor_Haraberutyun");


// 24. _________________________________________

//    int eranish = 852;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//
//    if (m > t){
//    int temp = m;
//    m = t;
//    t = temp;
//    }
//
//    if (t > h){
//        int temp = t;
//        t = h;
//        h = temp;
//    }
//        System.out.println(h);

// 25. _________________________________________

//    int eranish = 851;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//
//    if (m > t){
//    int temp = m;
//    m = t;
//    t = temp;
//    }
//
//    if (t > h){
//        int temp = t;
//        t = h;
//        h = temp;
//    }
//        System.out.println(m);

// 26. _________________________________________

//        int eranish = 859;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//
//        if (m > t){
//            System.out.println(eranish/(m + t + h));
//        }
//        else System.out.println(eranish);

// 27. _________________________________________

//        float eranish = 422f;
//    float m = eranish%10;
//    float t = eranish/10%10;
//    float h = eranish/100;
//
//    if (eranish > 300 && m != 0){
//        System.out.println(t/m);
//    }
//    else if (m != 0){
//        System.out.println(h/m);
//    }

// 28. _________________________________________
//    int eranish = 859;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//    char f;
//
//    if ((t + h) < 5){
//        f = 'a';
//    }
//    else f = 'b';
//
//        System.out.println(f);


// 29. _________________________________________

//    int eranish = 859;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//
//    if (m > t){
//        int temp = m;
//        m = t;
//        t = temp;
//    }
//
//    if (t > h){
//        int temp = t;
//        t = h;
//        h = temp;
//    }
//        System.out.println(m + " " + t + " " + h);

// 30. _________________________________________
//        int eranish = 859;
//    int m = eranish%10;
//    int t = eranish/10%10;
//    int h = eranish/100;
//
//    if (m < t){
//        int temp = m;
//        m = t;
//        t = temp;
//    }
//
//    if (t < h){
//        int temp = t;
//        t = h;
//        h = temp;
//    }
//        System.out.println(m + " " + t + " " + h);
//
// 31. _________________________________________
//    int qaranish = 3452;
//    int miavor = qaranish%10;
//    int tasnavor = qaranish/10%10;
//    int haryuravor = qaranish/100%10;
//    int hazaravor = qaranish/1000;
//    boolean t;
//
//    if (miavor + tasnavor == haryuravor + hazaravor) {
//        t = true;
//
//    }
//   else t = false;
//
//        System.out.println(t);
//

// 32. _________________________________________

//        int qaranish = 3452;
//    int miavor = qaranish%10;
//    int tasnavor = qaranish/10%10;
//    int haryuravor = qaranish/100%10;
//    int hazaravor = qaranish/1000;
//    int sum = 0;
//
//if (qaranish < 5000 && miavor != 0 || haryuravor != 0){
//    sum = qaranish / (miavor + haryuravor);
//}
//else sum = qaranish / (hazaravor / tasnavor);
//
//        System.out.println(sum);


// 33. _________________________________________

//        int qaranish = 1452;
//    int miavor = qaranish%10;
//    int tasnavor = qaranish/10%10;
//    int haryuravor = qaranish/100%10;
//    int hazaravor = qaranish/1000;
//    int sum = 0;
//
//    if (miavor == 1 || tasnavor == 1 || haryuravor == 1 || hazaravor == 1){
//        sum = 1;
//
//    }
//    else  sum = 0;
//        System.out.println(sum);

// 34. _________________________________________


//        int qaranish = 1432;
//    int miavor = qaranish%10;
//    int tasnavor = qaranish/10%10;
//    int haryuravor = qaranish/100%10;
//    int hazaravor = qaranish/1000;
//    char y;
//
//    if (miavor + tasnavor == 5){
//        y = 's';
//    }
//
//    else {
//         y = 'd';
//    }
//        System.out.println(y);

// 35. _________________________________________
//
//        int qaranish = 1432;
//    int miavor = qaranish%10;
//    int tasnavor = qaranish/10%10;
//    int haryuravor = qaranish/100%10;
//    int hazaravor = qaranish/1000;
//    int y;
//
//    if (miavor + tasnavor == 12){
//        y = 12;
//    }
//
//    else {
//         y = 0;
//    }
//        System.out.println("y" + "=" + y);


//36. _________________________________________

//        int qaranish = 1434;
//        int miavor = qaranish % 10;
//        int tasnavor = qaranish / 10 % 10;
//        int haryuravor = qaranish / 100 % 10;
//        int hazaravor = qaranish / 1000;
//        String y;
//        if (miavor == 4 || hazaravor == 4) {
//            y = "YES";
//        }
//        else  {
//            y = "NO";
//        }
//        System.out.println(y);

//37. _________________________________________

//        int qaranish = 1434;
//        int miavor = qaranish % 10;
//        int tasnavor = qaranish / 10 % 10;
//        int haryuravor = qaranish / 100 % 10;
//        int hazaravor = qaranish / 1000;
//
//    String y;
//    if (Math.pow((miavor + tasnavor + haryuravor + hazaravor),2) == qaranish){
//        y = "YES";
//    }
//    else {
//        y = "NO";
//    }
//        System.out.println(y);

//38. _________________________________________

//        int qaranish = 1443;
//        int miavor = qaranish % 10;
//        int tasnavor = qaranish / 10 % 10;
//        int haryuravor = qaranish / 100 % 10;
//        int hazaravor = qaranish / 1000;
//        int x;
//    if (miavor > tasnavor){
//         x = (miavor * haryuravor);
//    }
//
//    else {
//         x = 1;
//    }
//        System.out.println(x);
//39. _________________________________________

//        int qaranish = 1443;
//        int miavor = qaranish % 10;
//        int tasnavor = qaranish / 10 % 10;
//        int haryuravor = qaranish / 100 % 10;
//        int hazaravor = qaranish / 1000;
//        int x;
//       if ((miavor + tasnavor + haryuravor + hazaravor) > 20){
//           x = 1;
//
//       }
//        else x = 0;
//
//        System.out.println(x);

//40. _________________________________________

//        int qaranish = 1443;
//        int miavor = qaranish % 10;
//        int tasnavor = qaranish / 10 % 10;
//        int haryuravor = qaranish / 100 % 10;
//        int hazaravor = qaranish / 1000;
//        int x;
//       if ((miavor * tasnavor * haryuravor * hazaravor) > 200){
//           x = 0;
//
//       }
//        else x = 1;
//
//        System.out.println(x);
// 41. ___________________________________________

//        int a = 4, b = 5, c = 6, d = 8;
//        int n = 2;
//        int sum = 0;
//        if (a % n == 0){
//            sum += a;
//        }
//
//        if (b % n == 0) {
//            sum += b;
//        }
//
//        if (c % n == 0) {
//            sum += c;
//        }
//
//        if (d % n == 0) {
//            sum += d;
//        }
//
//        System.out.println(sum);

// 42. ___________________________________________

        //        int a = 4, b = 5, c = 6, d = 8;
//        int n = 2;
//        int sum = 0;
//        if (a % n == 0){
//            sum *= a;
//        }
//
//        if (b % n == 0) {
//            sum *= b;
//        }
//
//        if (c % n == 0) {
//            sum *= c;
//        }
//
//        if (d % n == 0) {
//            sum *= d;
//        }
//
//        System.out.println(sum);


// 43. ___________________________________________

//                float a = 4f, b = 5f, c = 6f, d = 8f;
//        float n = 4f;
//        float sum = 0;
//
//        if (a % n == 2f){
//            sum += a;
//        }
//
//        if (b % n == 2f) {
//            sum += b;
//        }
//
//        if (c % n == 2f) {
//            sum += c;
//        }
//
//        if (d % n == 2f) {
//            sum += d;
//        }
//
//        System.out.println(sum);


// 44. ___________________________________________

//        float a = 4f, b = 5f, c = 6f, d = 8f;
//        float n = 4f;
//        float sum = 0;
//
//        if (a % n == 3f){
//            sum += a;
//        }
//
//        if (b % n == 3f) {
//            sum += b;
//        }
//
//        if (c % n == 3f) {
//            sum += c;
//        }
//
//        if (d % n == 3f) {
//            sum += d;
//        }
//
//        System.out.println(sum);

// 45. ___________________________________________

//        int a = 5 ,b = 12 , c = 3, d = 15;
//        int n = 3;
//        int sum = 0;
//        if (a > 9 && a < 100 && a % n == 0){
//            sum += a;
//        }
//        if (b > 9 && b < 100 && b % n == 0){
//            sum += b;
//        }
//
//        if (c > 9 && c < 100 && c % n == 0){
//            sum += c;
//        }
//
//
//        if (d > 9 && d < 100 && d % n == 0){
//            sum += d;
//        }
//
//        System.out.println(sum);


// 46. ___________________________________________

//        int a = 5 ,b = 12 , c = 3, d = 15;
//
//        int sum = 0;
//        if (a > 9 && a < 100 && a % 3 == 0 && a % 5 == 0){
//            sum += a;
//        }
//        if (b > 9 && b < 100 && b % 3 == 0 && b % 5 == 0){
//            sum += b;
//        }
//
//        if (c > 9 && c < 100 && c % 3 == 0 && a % 5 == 0){
//            sum += c;
//        }
//
//
//        if (d > 9 && d < 100 && d % 3 == 0 && a % 5 == 0){
//            sum += d;
//        }
//
//        System.out.println(sum);


// 47. ___________________________________________
//
//        int a = 5 ,b = 12 , c = 31, d = 15;
//        int n = 5;
//        int sum = 0;
//        if (a > 9 && a < 100 && a % n != 0){
//            sum += a;
//        }
//        if (b > 9 && b < 100 && b % n != 0){
//            sum += b;
//        }
//
//        if (c > 9 && c < 100 && c % n != 0){
//            sum += c;
//        }
//
//
//        if (d > 9 && d < 100 && d % n != 0){
//            sum += d;
//        }
//
//        System.out.println(sum);

// 48. ___________________________________________
//                int a = 5 ,b = 12 , c = 3, d = 15;
//
//        int sum = 0;
//        if ( a % 3 != 0 || a % 2 != 0){
//            sum += a;
//        }
//        if (b % 3 != 0 || b % 2 != 0){
//            sum += b;
//        }
//
//        if (c % 3 != 0 || a % 2 != 0){
//            sum += c;
//        }
//
//
//        if (d % 3 != 0 || a % 2 != 0){
//            sum += d;
//        }
//
//        System.out.println(sum);

// 49. ___________________________________________

//        int a = 5 ,b = 132 , c = 32, d = 155;
//
//        int sum = 0;
//        if (a > 99 && a < 1000 && a % 3 == 1 && a % 4 == 2){
//            sum *= a;
//        }
//        if (b > 99 && b < 1000 && b % 3 == 1 && b % 4 == 2){
//            sum *= b;
//        }
//
//        if (c > 99 && c < 1000 && c % 3 == 1 && a % 4 == 2){
//            sum *= c;
//        }
//
//
//        if (d > 99 && d < 1000 && d % 3 == 1 && a % 4 == 2){
//            sum *= d;
//        }
//
//        System.out.println(sum);

// 50. ___________________________________________

//        int a =123, b = 400, c = 100;
//
//        int x = 999, y = 999, z = 999;
//        int sum = 0;
//
//        if (Math.sqrt((a*16))%2 ==0 ){
//            x = a;
//
//        }
//        if (Math.sqrt((b*16))%2 == 0){
//            y  = b;
//
//        }
//
//        if (Math.sqrt((c*16))%2 == 0){
//            z = c;
//
//        }
//if (x < y || x < z){
//     sum = x;
//
//}
//if (y < z ){
//     sum = y;
//}
//
//    else { sum = z;}
//
//        System.out.println(sum);


// 51. ___________________________________________
//        int a =1235, b = 4000, c = 1000;
//
//        int x = 9999, y = 9999, z = 9999;
//        int sum = 0;
//
//        if (Math.sqrt((a*26))%2 ==0 ){
//            x = a;
//
//        }
//        if (Math.sqrt((b*26))%2 == 0){
//            y  = b;
//
//        }
//
//        if (Math.sqrt((c*26))%2 == 0){
//            z = c;
//
//        }
//if (x < y || x < z){
//     sum = x;
//
//}
//if (y < z ){
//     sum = y;
//}
//
//    else { sum = z;}
//
//        System.out.println(sum);


// 54. ___________________________________________

//        int a = 144, b = 196, c = 256;
//        int n = 12;
//        int x = 999, y = 999, z = 999;
//        int sum = 0;
//        if (Math.sqrt(a) > n){
//            x = a;
//        }
//        if (Math.sqrt(b) > n){
//            y = b;
//        }
//        if (Math.sqrt(c) > n){
//            z = c;
//        }
//
//        if (x < y){
//            sum = x;
//        }
//
//        if (y < z){
//            sum = y;
//        }
//        else {
//            sum = z;
//        }
//
//        System.out.println(sum);

// 55. ___________________________________________

//int n = 9;
//boolean x;
//
//x = (Math.sqrt(n) == 3);
//
//        System.out.println(x);


// 56. ___________________________________________
//    int n = 16;
//    int y = 0;
//    if (Math.sqrt(n) != 4){
//        y = 0;
//    }
//    else y = 1;
//
//        System.out.println(y);

// 57. ___________________________________________
//
//    int n = 1232896;
//    int sum = 0;
//
//    while (n > 0){
//        n = n%10;
//        sum+=n;
//    }
//
//        System.out.println(sum);


// 58. ___________________________________________

//    int n = 12321;
//    int f = n/10000%10;
//    int x = n/1000%10;
//    int y = n/100%10;
//    int z = n/10%10;
//    int w = n%10;
//        System.out.println(f + x + y + z + w);

// 59. ___________________________________________
//    int n = 12321;
//    int f = n/10000%10;
//    int x = n/1000%10;
//    int y = n/100%10;
//    int z = n/10%10;
//    int w = n%10;
//        System.out.println(f * x * y * z * w);

// 60. ___________________________________________

//        int n = 12324;
//    int f = n/10000%10;
//    int x = n/1000%10;
//    int y = n/100%10;
//    int z = n/10%10;
//    int w = n%10;
//
//        System.out.println(w + "" + z + "" + y + "" + x + "" + f);


// 61. ___________________________________________

///   int n = 12324;
//    int f = n/10000%10;
//    int x = n/1000%10;
//    int y = n/100%10;
//    int z = n/10%10;
//    int w = n%10;
//
//        System.out.println(f + "" + x + "" + y + "" + z + "" + w);

// 62. ___________________________________________
//        int n = 12024;
//   int x = 2;
//   int sum = 0;
//   while (n > 0) {
//       n = n / 10;
//       sum++;
//       if (sum == x) {
//
//           System.out.println(n);
//
//       }
//   }
//
//


// 63. ___________________________________________

//    int n = 12024;
//    int f = n/10000%10;
//    int x = n/1000%10;
//    int y = n/100%10;
//    int z = n/10%10;
//    int w = n%10;
//boolean t;
//
//    t = (f == 2 || x == 2 || y == 2 || z == 2 || w == 2);
//        System.out.println(t);

// 64. ___________________________________________
//        int n = 22222;
//        int f = n/10000%10;
//        int x = n/1000%10;
//        int y = n/100%10;
//        int z = n/10%10;
//        int w = n%10;
//        boolean t;
//
//        t = (f == x && x == y && y == z && z == w );
//        System.out.println(t);

// 65. ___________________________________________
//
//        int n = 23222;
//        int f = n/10000%10;
//        int x = n/1000%10;
//        int y = n/100%10;
//        int z = n/10%10;
//        int w = n%10;
//        boolean t;
//
//
//       t = (f%2 !=0 || x%2 !=0 || y%2 !=0 || z%2 !=0 || w%2 !=0);
//        System.out.println(t);

// 66. ___________________________________________
//
//        int n = 2323;
//
//        int x = n/1000%10;
//        int y = n/100%10;
//        int z = n/10%10;
//        int w = n%10;
//        int kent = 0;
//        int zuyg = 0;
//        boolean t;
//
//
//
//        if ( x % 2 == 0){
//            zuyg ++;
//        }
//        else kent++;
//
//        if ( y % 2 == 0){
//            zuyg ++;
//        }
//        else kent++;
//
//        if ( z % 2 == 0){
//            zuyg ++;
//        }
//
//        else kent++;
//
//        if ( w % 2 == 0){
//            zuyg ++;
//        }
//        else kent++;
//
//        t = (kent == zuyg);
//
//        System.out.println(t);
//______________________________________________
//        for (int i = 0; i < 10; i++) {
//
//            for (int j = 0; j < 10-i; j++) {
//
//                System.out.print("x");
//            }
//
//            System.out.println();
//        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("arajin mutq");
//        int input1 = in.nextInt();
//        System.out.println("gorcoxutjeun");
//        char gorcoxutyun = in.next().charAt(0);
//        System.out.println("erkrord mutq");
//        int input2 = in.nextInt();
//        int patasxan = 0;
//        switch (gorcoxutyun){
//            case '+': patasxan =  (input1 + input2);
//            break;
//            case '-': patasxan = (input1 - input2);
//            break;
//            case '*': patasxan = (input1 * input2);
//            break;
//            case '/': patasxan = (input1 / input2);
//            break;
//        }
//        System.out.println("ARDYUNQ\t"+ patasxan);

//        Scanner x = new Scanner(System.in);
//        int input = x.nextInt();
//        if (input > 99){
//            System.out.println("error");
//        }
//        String bar = "";
//        String barTasnavor = "";
//        int outputMiavor = input%10;
//        int outputTasnavor = input/10;
//
//    switch (outputMiavor){
//        case 1: bar = "mek";
//        break;
//        case 2: bar = "erku";
//        break;
//        case 3: bar = "ereq";
//        break;
//    }
//
//        switch (outputMiavor){
//            case 1: barTasnavor = "tas";
//                break;
//            case 2: barTasnavor = "qsan";
//                break;
//            case 3: barTasnavor = "eresun";
//                break;
//        }
//        System.out.println(barTasnavor+bar);


        //___________________________
//        Scanner x = new Scanner(System.in);
//        int tiv = x.nextInt();
//        if (tiv > 99) {
//            System.out.println("error");
//        }
//        int miavor = tiv%10;
//        int tasnavor = tiv/10%10;
//        int haryuravor = tiv/100;
//
//    switch (haryuravor){
//        case 1:
//            System.out.print("HARYUR");
//            break;
//        case 2:
//            System.out.print("ERKUHARYUR");
//            break;
//        case 3:
//            System.out.print("EREQHARYUR");
//            break;
//        case 4:
//            System.out.print("CHORSHARYUR");
//            break;
//        case 5:
//            System.out.print("HINGHARYUR");
//            break;
//        case 6:
//            System.out.print("VECHARYUR");
//            break;
//        case 7:
//            System.out.print("YOTHARYUR");
//            break;
//        case 8:
//            System.out.print("UTHARYUR");
//            break;
//        case 9:
//            System.out.print("IN@HARYUR");
//            break;
//
//    }
//
//        switch (tasnavor){
//            case 1:
//                System.out.print("TAS");
//                break;
//            case 2:
//                System.out.print("QSAN");
//                break;
//            case 3:
//                System.out.print("ERESUN");
//                break;
//            case 4:
//                System.out.print("QARASUN");
//                break;
//            case 5:
//                System.out.print("HISUN");
//                break;
//            case 6:
//                System.out.print("VATSUN");
//                break;
//            case 7:
//                System.out.print("YOTANASUN");
//                break;
//            case 8:
//                System.out.print("UTANASUN");
//                break;
//            case 9:
//                System.out.print("INSUN");
//                break;
//        }
//
//        switch (miavor){
//            case 1:
//                System.out.print("MEK");
//                break;
//            case 2:
//                System.out.print("ERKU");
//                break;
//            case 3:
//                System.out.print("EREQ");
//                break;
//            case 4:
//                System.out.print("CHORS");
//                break;
//            case 5:
//                System.out.print("HING");
//                break;
//            case 6:
//                System.out.print("VEC");
//                break;
//            case 7:
//                System.out.print("YOT");
//                break;
//            case 8:
//                System.out.print("UT");
//                break;
//            case 9:
//                System.out.print("IN@");
//                break;
//        }
//        System.out.println();
//        System.out.print(haryuravor +" "+ tasnavor +" "+ miavor);
//68_______________________________________
//        float drakanTarer = 0f;
//        float sum = 0f;
//        int[] masiv = {1,-2,6,5,-4,-8,-9,7};
//        for (int i = 0; i < masiv.length; i++) {
//        if (masiv[i] > 0){
//            sum++;
//            drakanTarer += masiv[i];
//        }
//
//        }
//        System.out.println(drakanTarer/sum);

//69_______________________________________

//        float drakanTarer = 0f;
//
//        int[] masiv = {1,-2,6,5,-4,-8,-9,7};
//        for (int i = 0; i < masiv.length; i++) {
//        if (masiv[i] > 0){
//
//            drakanTarer += masiv[i];
//        }
//
//        }
//        System.out.println(Math.sqrt(drakanTarer));


//70_______________________________________

//        float drakanTarer = 0f;
//
//        int[] masiv = {1,-2,6,5,-4,-8,-9,7};
//        for (int i = 0; i < masiv.length; i++) {
//        if (masiv[i] < 0){
//
//            drakanTarer += masiv[i];
//        }
//
//        }
//        System.out.println(Math.sqrt(drakanTarer*-1));

//int[] masiv = {5,1,6,8,7,9};
//
//        for (int i = 0; i < masiv.length; i++) {
//
//            for (int j = i+1; j < masiv.length; j++) {
//
//                if (masiv[i] > masiv[j]){
//                    int temp = masiv[i];
//                    masiv[i] = masiv[j];
//                    masiv[j] = temp;
//                }
//
//
//            }
//
//        }
//        System.out.println(Arrays.toString(masiv));

//        1. Напишите программу, которая считывает символы пока не встретится
//           точка. Также предусмотрите вывод количества пробелов.


//        Scanner in = new Scanner(System.in);
//        String input = in.next();
//
//        char[] masiv = input.toCharArray();
//        int sum = 0;
//        for (int i = 0; i < masiv.length; i++) {
//
//
//
//            if (masiv[i] == '.'){
//                break;
//            }
//            sum++;
//            System.out.print(masiv[i]);
//
//        }
//        System.out.println();
//        System.out.println(sum);

// 3. Напишите метод, который будет увеличивать заданный элемент массива на 10%.
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        float [] masiv = {5,2,3,4,6,8,};
//
//        float ardyunq = masiv[x] + masiv[x]*10/100;
//        System.out.println(ardyunq);

//4. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»

//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//
//
//        String input1 = input.replaceAll("fack","xxx");
//        System.out.println(input1);


//        for (int i = 2; i <101 ; i++) {
//
//            if (i%2 == 0) {
//                System.out.print(i);
//            }
//        }

        //     Напишите рекурсивный метод отображающий строку задом на перед

//String masiv = "Aram";
//
//
//      String tox = new StringBuffer(masiv).reverse().toString();
//        System.out.println(tox);


//10. Найдите победителя марафона.
//Группа людей участвует в марафоне, их имена и время за которое
// они пробежали марафон вы можете увидеть ниже.
//Ваша задача найти человека, который быстрее всех
// пробежал дистанцию и вывести его имя и счет.
//(Опционально) Найдите человека, который прибежал вторым

//__________________________________________________________________________
//        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
//                "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
//                "Daniel", "Neda", "Aaron", "Kate" };
//
//        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243,
//                334, 412, 393, 299, 343, 317, 265 };
//
//        for (int i = 0; i < times.length; i++) {
//            for (int j = 1; j < times.length-1; j++) {
//
//
//            }
//
//
//
//            }
//        }

//_____________________________________________________________________________________


//74 _____________________________

//        int[] masiv = {3,5,2,4,7};
//        int sum = 0;
//        double kent = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//
//            if (masiv[i]%2 != 0){
//                kent +=Math.pow(masiv[i],2) ;
//                sum += 1;
//            }
//
//        }
//
//        System.out.println(kent/sum);

//77 _____________________________

//        int[] masiv = {3,5,2,4,7};
//int zuyg = 0;
//int kent = 0;
//        for (int i = 0; i < masiv.length; i++) {
//
//            if (masiv[i]%2 == 0){
//                zuyg += 1;
//            }
//        else kent += 1;
//        }
//
//        System.out.println("zuyg\t"+zuyg);
//        System.out.println("kent\t"+kent);

//78 _____________________________
//        int[] masiv = {3,5,6,1,2,4,7};
//
//        int a = 3;
//        int b = 6;
//        int sum = 0;
//        int tarer = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//
//            if (i > a && i < b){
//                sum +=1;
//                tarer += masiv[i];
//            }
//        }
//        System.out.println(tarer/sum);

//81 _____________________________
//
//        int[] masiv = {3,5,6,1,2,4,7};
//      int k = 5;
//      int sum = 0;
//        for (int i = 0; i < masiv.length; i++) {
//
//            if (masiv[i] < k){
//            sum += Math.pow(masiv[i] , 3);
//            }
//
//        }
//
//        System.out.println(sum);


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10-i ; j++) {
//
//                System.out.print('x');
//
//            }
//            System.out.println();
//        }


//84________________________________


//    int[] masiv = {4,1,5,2,8,9,6};
//
//    int sum = 0;
//    int tar = 0;
//    int k = 2;
//
//        for (int i = 1; i < masiv.length; i++) {
//
//            if (k == Mat.pow(i,2){
//                tar =+ masiv[i];
//                sum =+ 1;
//            }
//        }
//
//        System.out.println(tar/sum);


//85________________________________

//        int[] masiv = {4,1,5,2,8,9,6};
//
//
//    int tar = 0;
//    int k = 2;
//
//        for (int i = 1; i < masiv.length; i++) {
//
//            if (i % k == 0){
//                tar =+ masiv[i];
//
//            }
//        }
//
//        System.out.println(tar);

//86________________________________
//
//        int[] masiv = {4,3,1,8,9,7,5,1,10,45,71};
//        int sum = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] - i > 0){
//                sum += 1;
//            }
//
//        }
//        System.out.println(sum);


//88________________________________

//    Scanner in = new Scanner(System.in);

//    String out = new  StringBuffer(in.nextLine()).reverse().toString();
//String out = in.nextLine().replace("Aram","aaa");

//int count = in.nextInt();
//int diapazon = in.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            Random ran = new Random();
//            int outx = ran.nextInt(diapazon);
//            System.out.println("Hellow\t" + outx);
//        }

//        Scanner in = new Scanner(System.in);
//        String bazapass = "Aram";
//        System.out.println("Mutqagreq gaxtnabar@");
//        String pass = in.next();
//
//        if (bazapass.compareTo(pass) == 0){
//            System.out.println("welcome");
//        }
//        else {
//            System.out.println("gaxtnabar@ sxal e");
//        }

// tpel zangvaci mecaguyn ev poqraguyn tareri arjeqner@:
//
//      int[] tver = {5, 4, 2, 6, 3, 7, 8, 9};
//
//        int mec = 0;
//        int poqr = 0;
//
//
//        for (int i = 0; i < tver.length; i++) {
//
//            for (int j = 0; j < tver.length; j++) {
//
//                if (tver[i] > tver[j]) {
//
//                    mec = tver[i];
//                }
//
//            }
//            if (tver[i] < mec) {
//                poqr = tver[i];
//            }
//        }
//
//
//        System.out.println(mec);
//        System.out.println(poqr);

// mutqagrum em  N tiv, vor@ kazmum e masivi tveri qanak@ ev masivum
// texadrum e minchev nshvac N tvi random tver, ev artacolum e ayn tver@
// voronq bajanvum en k i aranc mnacord;

//
//        Scanner in = new Scanner(System.in);
//        int k = 2;
//        List<Integer> masiv = new ArrayList <Integer>();
//    int input = in.nextInt();
//
//        for (int i = 0; i < input; i++) {
//
//            Random r = new Random();
//                int out = r.nextInt(input);
//            masiv.add(out);
//        }
//
//
//        for (int j = 0; j < masiv.size(); j++) {
//
//            if (masiv.get(j) % k == 0){
//
//                System.out.println(masiv.get(j));
//
//            }
//
//        }
//        System.out.println(masiv);

//        List<Integer> newMasiv = new ArrayList <Integer>();
//        int sum = 0;
//        Scanner in  = new Scanner(System.in);
//
//        System.out.println("MUTQAGREL MASIVI TARERI QANAK@");
//        int input = in.nextInt();
//
//        System.out.println("MUTQAGREL MASIVI TARER@");
//        for (int i = 0; i < input; i++) {
//
//            int masivinput = in.nextInt();
//            newMasiv.add(masivinput);
//
//        }
//        System.out.println(newMasiv);
//        for (int j = 0; j < newMasiv.size(); j++) {
//            for (int k = j +1 ; k < newMasiv.size()-j; k++) {
//
//                if (newMasiv.get(j) < newMasiv.get(k)){
//                    sum += newMasiv.get(j);
//                }
//            }
//
//        }
//
//        System.out.println(sum);

//        Scanner in = new Scanner(System.in);
//        List<Integer> masiv = new ArrayList <Integer>();
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            int input = in.nextInt();
//            masiv.add(input);
//        }
//        for (int j = 0; j < masiv.size(); j++) {
//
//            for (int k = j +1 ; k < masiv.size()-j; k++) {
//
//                if ( masiv.get(j) > masiv.get(k) ){
//
//                    sum += 1;
//
//                }
//
//            }
//
//
//        }
//
//        System.out.println(masiv);
//        System.out.println(sum);

//        Scanner in = new Scanner(System.in);
//        List<Integer> masiv = new ArrayList <Integer>();
//        int patasxan = 0;
//        for (int i = 0; i < 10; i++) {
//
//            masiv.add(in.nextInt());
//        }
//
//        for (int j = 0; j < masiv.size(); j++) {
//
//            for (int k = j + 1; k < masiv.size() - j; k++) {
//
//                if (masiv.get(j) > masiv.get(k)){
//                    patasxan = masiv.get(j)* masiv.get(k);
//
//                }
//
//            }
//        }
//        System.out.println(masiv);
//        System.out.println(patasxan);


//        for (int i = 0; i < 10; i++) {
//            System.out.println("");
//            for (int j = 0; j < 10 - i; j++) {
//                System.out.print("x");
//            }
//        }

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("mutq 1");
//        int mutq1 = in.nextInt();
//        System.out.println("gorcoxutyun");
//        char operation = in.next().charAt(0);
//        System.out.println("mutq 2");
//        int mutq2 = in.nextInt();
//        int patasxan = 0;
//
//        switch (operation){
//            case '+': patasxan =   (mutq1 + mutq2);
//            break;
//
//            case '-': patasxan = (mutq1 - mutq2);
//            break;
//
//            case  '*': patasxan = (mutq1 * mutq2);
//            break;
//        }
//
//        System.out.println(patasxan);

//
//        //Unsorted array
//        Integer[] a = { 2, 6, 3, 5, 1 };
//
//        //Call merge sort
//        mergeSort(a);
//
//        //Check the output which is sorted array
//        System.out.println(Arrays.toString(a));
//    }
//
//    @SuppressWarnings("rawtypes")
//    public static Comparable[] mergeSort(Comparable[] list)
//    {
//        //If list is empty; no need to do anything
//        if (list.length <= 1) {
//            return list;
//        }
//
//        //Split the array in half in two parts
//        Comparable[] first = new Comparable[list.length / 2];
//        Comparable[] second = new Comparable[list.length - first.length];
//        System.arraycopy(list, 0, first, 0, first.length);
//        System.arraycopy(list, first.length, second, 0, second.length);
//
//        //Sort each half recursively
//        mergeSort(first);
//        mergeSort(second);
//
//        //Merge both halves together, overwriting to original array
//        merge(first, second, list);
//        return list;
//    }
//
//    @SuppressWarnings({ "rawtypes", "unchecked" })
//    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result)
//    {
//        //Index Position in first array - starting with first element
//        int iFirst = 0;
//
//        //Index Position in second array - starting with first element
//        int iSecond = 0;
//
//        //Index Position in merged array - starting with first position
//        int iMerged = 0;
//
//        //Compare elements at iFirst and iSecond,
//        //and move smaller element at iMerged
//        while (iFirst < first.length && iSecond < second.length)
//        {
//            if (first[iFirst].compareTo(second[iSecond]) < 0)
//            {
//                result[iMerged] = first[iFirst];
//                iFirst++;
//            }
//            else
//            {
//                result[iMerged] = second[iSecond];
//                iSecond++;
//            }
//            iMerged++;
//        }
//        //copy remaining elements from both halves - each half will have already sorted elements
//        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
//        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
//88
//        int [] masiv = new int[5];
//         masiv[0] = 4;
//         masiv[1] = 3;
//         masiv[2] = 1;
//         masiv[3] = 2;
//         masiv[4] = 5;
//         int sum = 0;
//        for (int i = 0; i < masiv.length; i++) {
//
//
//                if (masiv[i] % 2 == 0){
//                    sum += Math.pow(masiv[i],2);
//                }
//        }
//
//        System.out.println(sum);


// 95.
//        int [] masiv = {1,5,3,4,6,9,7,4};
//        int sum = 0;
//        int count = 0 ;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 3 == 0){
//                count++;
//                sum+=masiv[i];
//            }
//        }
//        System.out.println(sum/count);

//103.
//        int[] masiv = {1,5,3,5,8,9,10,7};
//        int sum = 0;
//        for (int i = 0; i <masiv.length ; i++) {
//
//            if ( (masiv[i] + i) % 3 == 0 ){
//                sum += Math.pow(masiv[i], 2);
//            }
//
//        }
//        System.out.println(sum);

//
//
//        int masiv[] = new int[10];
//        int index = 0;
//         masiv[index] = 0;
//
//        for (int i = 1; i < masiv.length; i++) {
//                index++;
//                masiv[index] = i;
//
//
//        }
//        System.out.println(Arrays.toString(masiv));

////// 118.
//        int masiv []= {1,5,-8,4,-7,9,-6,3};
//        int count = 0;
////
//////        for (int i = 0; i < masiv.length; i++) {
//        for (int i:masiv) {
//
//
//        if (i > 0){
//                count++;
//
//            }
//        }
//
//
//    int newMasiv[] = new int[count];
//        int sum = 0;
//
//        for (int j :masiv ) {
//            if (j > 0){
//                newMasiv[sum] = j;
//                sum++;
//            }
//        }
//
//        System.out.println(Arrays.toString(newMasiv));

//_______________________________________________________________________________
//        int coffe = 10, sugar = 10;
//        int putting = 0;
//        int sugerBaton = 0;
//        int coffeBaton = 0;
//
//// coffe = 1 @ntrel coffe;
//// suger = 1 @ntrel suger
//// suger = 0 aranc suger
//
//        for (int i = coffe; i > 0; i--) {
//
//
//// payment input;
//            Scanner in = new Scanner(System.in);
//            System.out.println("pay");
//            int payment = in.nextInt();
//
//            System.out.println("Coffe");
//            coffeBaton = in.nextInt();
//
//            if (payment >= 100 && coffeBaton == 0) {
//                System.out.println("putting\t" + payment);
//
//            }
//
//            if (payment > 100 && coffeBaton == 1) {
//                System.out.println("suger");
//                sugerBaton = in.nextInt();
//            }
//
////operation
//
//
//            if (payment == 100 && coffeBaton == 1) {
//                coffe = coffe - 1;
//                putting = 0;
//
//                if (putting >= 0) {
//                    System.out.println("one cup coffe\t" + "without sugar");
//                    System.out.println("putting\t" + putting);
//                }
//
//
//            }
//
//            if (payment > 100 && coffeBaton == 1 && sugerBaton == 1) {
//                putting = payment - 200;
//                if (payment -200 >=0) {
//                    coffe = coffe - 1;
//                    sugar = sugar - 1;
//                }
//                if (putting >= 0) {
//                    System.out.println("one cup coffe\t" + "+" + " sugar");
//                    System.out.println("putting\t" + putting);
//                }
//            } else if (payment > 100 && coffeBaton == 1 && sugerBaton == 0) {
//                putting = payment - 100;
//                coffe = coffe - 1;
//
//                if (putting >= 0) {
//                    System.out.println("one cup coffe\t" + "without sugar");
//                    System.out.println("putting\t" + putting);
//                }
//
//            }
//
//
//            System.out.println("coffe/sugar MNACORT\t" + coffe + " " + sugar);
//
//            if (coffe == 0) {
//                System.out.println("coffe is Empty");
//                return;
//            }
//
//        }


//119
//int[] masiv = {1,49,21,8,15,64} ;
//        int count = 0;
//
//        for (int i :masiv
//             ) {
//            if (i % 7 == 0) {
//                count++;
//            }
//        }
//        int[] newMasiv = new int[count];
//        int index = 0;
//        for (int j :masiv
//             ) {
//            if (j % 7 == 0){
//                newMasiv[index] = j;
//                index++;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(newMasiv));


// 120.

//int[] masiv = {1,5,4,6,8,7,3,2};
//int count = 0;
//int a = 2;
//int b = 6;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (i >= a && i <= b){
//                count++;
//            }
//        }
//
//        int[] NewMasiv = new int[count];
//        int index = 0;
//
//
//        for (int j = 0; j < masiv.length; j++) {
//
//            if (j >= a && j <= b){
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//121

//   float[] masiv = {1,2,5,6,7,9,3,4};
//    int count = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 2 != 0){
//                count++;
//            }
//        }
//
//
//        float[] NewMasiv = new float[count];
//        int index = 0 ;
//
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] % 2 != 0) {
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//122.

//           float[] masiv = {1,2,5,6,7,9,3,4};
//    int count = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 2 == 0){
//                count++;
//            }
//        }
//
//
//        float[] NewMasiv = new float[count];
//        int index = 0 ;
//
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] % 2 == 0) {
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));


//123.

//   int[] masiv = {1,2,5,6,16,9,3,4};
//    int count = 0;
//    int k = 7;
//
//        for (int i = 0; i < masiv.length; i++) {
//
//
//                if (masiv[i] % k == 2) {
//                    if (masiv[i] > 2) {
//                        count++;
//                    }
//            }
//
//        }
//        int[] NewMasiv = new int[count];
//        int index = 0 ;
//
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] % k == 2) {
//                if (masiv[j] != 2) {
//
//
//                    NewMasiv[index] = masiv[j];
//                    index++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//124
//    int [] masiv = {5,10,1,2,3,7,9,8,-5};
//    int k = 3;
//    int count = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] > k){
//                count++;
//            }
//        }
//
//        int[] Newmasiv = new int[count];
//        int index = 0;
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] > k){
//                Newmasiv[index] = masiv[j];
//                index++;
//            }
//        }
//
//        System.out.println(Arrays.toString(Newmasiv));

//125.

//int masiv[] = {1,2,5,8,7,9,6,3};
//    int count = 0;
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 2 == 0){
//                count++;
//            }
//        }
//    int New[] = new int[count];
//        int index = 0;
//        for (int j = 0; j < masiv.length; j++) {
//
//            if (masiv[j] % 2 == 0){
//                New[index] = masiv[j];
//                index++;
//            }
//        }
//
//        System.out.println(Arrays.toString(New));

//126.
//
//   int[] masiv = {1,5,6,4,7,2,3,9,-4};
//   int count = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 2 != 0){
//                count++;
//            }
//        }
//        int NewMasiv[] = new int[count];
//        int index = 0;
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] % 2 != 0){
//                NewMasiv[index] = masiv[j];
//                index++;
//
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//127.

//        int[] masiv = {2,1,8,6,3,7,5,2};
//        int k = 10;
//        int count = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//
//            if (Math.pow(masiv[i],2) > k ){
//                count++;
//            }
//        }
//        int NewMasiv[] = new int[count];
//        int index = 0;
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (Math.pow(masiv[j],2) > k ){
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(NewMasiv));


//128.
//int[] masiv = {1,5,-8,3,-7,12,2};
//int count = 0;
//int max = masiv[0];
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] > 0 ){
//
//                count++;
//                if ( masiv[i] > max){
//                    max = masiv[i];
//                }
//            }
//        }
//        int NewMasiv[] = new int[count];
//        int index = 0;
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] > 0){
//                NewMasiv[index] = masiv[j] + max;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//129.

//int[] masiv = {-8,5,8,6,-7,-6,6,3};
//
//int newmasiv[] = new int[masiv.length/2];
//       int index = 0;
//
//
//        for (int i = 0; i < masiv.length; i+=2) {
//   if (Math.abs(masiv[i]) > Math.abs(masiv[i + 1])) {
//       newmasiv[index] = masiv[i];
//       index++;
//   }
//              if (Math.abs(masiv[i]) < Math.abs(masiv[i + 1])){
//                  newmasiv[index] = masiv[i + 1];
//                  index++;
//              }
//            }
//
//
//        System.out.println(Arrays.toString(newmasiv));

//130
//        int[] masiv = {8,11,9,8,8,8};
//        int temp = 0;
//        int index = 0;
//
//        int[] Newmasiv = new int[masiv.length];
//
//        for (int i = 0; i < masiv.length; i+=2) {
//            if (masiv[i] % 2 == 0 && masiv[i + 1] % 2 != 0){
//
//                Newmasiv[index] = masiv[i + 1];
//                Newmasiv[index +  1] = masiv[i];
//                index++;
//            }
//            else if (masiv[i] % 2 != 0 || masiv[i + 1] % 2 == 0){
//                Newmasiv[index] = masiv[i];
//                Newmasiv[index +1] = masiv[i + 1];
//                index++;
//            }
//
//
//            index++;
//        }
//
//        System.out.println(Arrays.toString(Newmasiv));

//131.
//
//        int[] masiv = {-1,2,-8,6,7,9,4,8};
//
//        int count = 0;
//        int index = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] > 0){
//                count++;
//            }
//
//        }
//int NewMasiv[] = new int[masiv.length + count];
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] > 0){
//                NewMasiv[index] = masiv[j];
//                NewMasiv[index + 1] = 0;
//                index++;
//            }
//        else  {
//            NewMasiv[index] = masiv[j];
//
//            }
//        index++;
//        }
//        System.out.println(Arrays.toString(NewMasiv));

////132
//        int[] masiv = {10, -2, 8, 4, -6, -4, 8, 9};
//        int b = 4;
//        int banali = 0;
//        int count1 = 0;
//        int count2 = 0;
//
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] > 0) {
//                count1++;
//            }
//
//            if (masiv[i] < b && masiv[i] > 0) {
//                banali++;
//            }
//
//            if (masiv[i] < 0) {
//                count2++;
//            }
//
//        }
//
//
//        if (banali == 0) {
//            count1 = count2;
//        }
//
//        int NewMasiv[] = new int[count1];
//        int index = 0;
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (banali > 0 && masiv[j] > 0) {
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//
//            if (banali == 0 && masiv[j] < 0) {
//                NewMasiv[index] = masiv[j];
//                index++;
//            }
//        }
//
//
//        System.out.println(Arrays.toString(NewMasiv));

//// 133.
//int masiv[] = {1,5,-2,-6,8,3,22,-10};
//
//// vektor min/max
//        int min = masiv[0];
//        int max = 0;
//        for (int i = 0; i < masiv.length; i++) {
//            if (min > masiv[i]){
//                min = masiv[i];
//            }
//            else if (min < masiv[i]){
//                max = masiv[i];
//            }
//        }
//
//// nor masivi haytararum ev tareri qanak@
//
//        int count = 0;
//        int index = 0;
//
//
//        for (int j:masiv) {
//            if (Math.abs(j) < (min + max) / 2){
//                count++;
//
//            }
//        }
//        int NewMasiv[] = new int[count];
//        for (int k:masiv ) {
//
//            if (Math.abs(k) < (min + max)/2){
//                NewMasiv[index] = k;
//                index++;
//            }
//
//        }
//        System.out.println(Arrays.toString(NewMasiv));

//134.

//int[] masiv = {1,5,8,9,7,5,3,4};
//
//// voroshel amenamec zuyg index unecox tar@
//        int zuygMAX = masiv[0];
//        int count = 0;
//        int index = 0;
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i] % 2 == 0 && masiv[i] > zuygMAX){
//                zuygMAX  = masiv[i];
//            }
//        }
//
//
//
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] % 2 != 0){
//                count ++;
//
//
//            }
//        }
//        int[] NewMas = new int[count];
//
//        for (int k:masiv ) {
//            if (k % 2 != 0){
//                NewMas[index] = k + zuygMAX;
//                index++;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(NewMas));


//135.///////////////////////////////////////////////////////////////

//        int masiv[] = {1, 0, 2, 0, -1, -5, -3, 8};
//        int count0 = 0;
//        int countdr = 0;
//        int countminus = 0;
//
//
//
//        for (int i : masiv) {
//            if (i == 0) {
//                count0++;
//            }
//            if (i > 0) {
//                countdr++;
//            }
//            if (i < 0) {
//                countminus++;
//            }
//        }
//
//
//
//        int NewMasiv[] = new int[count0];
//        int index = 0;
//        for (int j : masiv) {
//
//            if (j == 0) {
//
//                NewMasiv[index] = j;
//                index++;
//
//            }
//        }
//
//        System.out.println(Arrays.toString(NewMasiv));
//        index = 0;
//        count0 = countdr;
//        for (int d : masiv) {
//
//            if (d > 0) {
//
//                NewMasiv[index] = d;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(NewMasiv));
//        index = 0;
//        count0 = countminus;
//        for (int k : masiv) {
//            if (k < 0) {
//
//
//
//                NewMasiv[index] = k;
//                index++;
//            }
//
//        }
//        System.out.println(Arrays.toString(NewMasiv));


        //136.
//
//        int masiv[] = {1, 5, 8, 9, 7, 6, 1, 8};
//
//        int max = masiv[0];
//        for (int i : masiv) {
//            if (i > max) {
//                max = i;
//            }
//
//        }
//
//        int Newmasiv[] = new int[masiv.length ];
//        int index = 0;
//        for (int j = 0; j < masiv.length; j += 2) {
//            if (masiv[j] > masiv[j + 1] || masiv[j] < masiv[j + 1]) {
//                Newmasiv[index] = masiv[j] + max;
//                Newmasiv[index + 1] = 0;
//                index++;
//
//            }
//            index ++;
//        }
//
//        System.out.println(Arrays.toString(Newmasiv));


//137

//
//
//            int masiv[]= {5,6,8,2,1,8,3,6,4};
//
//            int Y[] = new int[masiv.length];
//
//
//
//            int max = masiv[0];
//            int indexMax = 0;
//            for(int i = 0; i< masiv.length; i++){
//                if(masiv[i] > max){
//                    max = masiv[i];
//                    indexMax = i;
//                }
//            }
//            int min = masiv[0];
//            int indexMin = 0;
//            for(int i = 0; i< masiv.length; i++){
//                if(masiv[i] <= min){
//                    min = masiv[i];
//                    indexMin = i;
//                }
//            }
//
//            int j = 0;
//            for(int i = 0; i < masiv.length; i++){
//                if(i != indexMax && i != indexMin){
//                    Y[j] = masiv[i];
//                    j++;
//                }
//            }
//
//            for(int i = 0; i < j; i++){
//                System.out.print(Y[i]+" ");
//            }

//        int masiv[]= {5,8,8,2,1,8,3,6,4};
//
//        int max = masiv[0];
//        for (int i = 0; i < masiv.length; i++) {
//            if (masiv[i]> max){
//                max = masiv[i];
//            }
//
//        }
//
//        int min = masiv[0];
//        for (int j = 0; j < masiv.length; j++) {
//            if (masiv[j] < min){
//                min = masiv[j];
//            }
//        }
//
//    int count = 0;
//        for (int h = 0; h < masiv.length; h++) {
//            if (masiv[h] != min && masiv[h] != max){
//                count++;
//            }
//        }
//
//        int NEWmasiv[] = new int[count];
//        int index = 0;
//        for (int k = 0; k < masiv.length; k++) {
//            if (masiv[k] != min && masiv[k] != max){
//                NEWmasiv[index] = masiv[k];
//                index++;
//            }
//        }
//
//        System.out.println(Arrays.toString(NEWmasiv));
//_________________________________________________________
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("mutqagreq tiv@");
//        int input1 = in.nextInt();
//        System.out.println("mutqagreq gorcopxutyun@");
//        int operation = in.next().charAt(0);
//        System.out.println("mutqagreq erkrord tiv@");
//        int input2 = in.nextInt();
//        int patasxan = 0;
//
//
//        switch (operation){
//
//            case '+':patasxan =
//                (input1 + input2);
//            break;
//            case '-':
//                patasxan = (input1 - input2);
//                break;
//
//
//        }

//
//        System.out.println(patasxan);
/////////ZANGVAC//////////////
//int masiv[] = {8,1,3,4,5,6};
//int right = 0;
//int left = 0;
//int[] masiv1 = new int[10];
//int[] masiv2 = new int[10];
//int x = 0;
//int y = 0;
//
//        for (int i = 0; i <masiv.length ; i++) {
//            for (int j = i+1; j < masiv.length; j++) {
//
//                if (masiv[i] > (x += masiv[j])){
//                    System.out.println(x);
//                    System.out.println(masiv[i]);
//
//
//            }
//            }


//        }


///////STRING//////////////

        //138
//  String str = "abcdabcdjhl";
//  int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a'){
//                count++;
//            }
//        }
//
//        System.out.println(count);


//139
//        String str = "AnnA";
//        String str1 = "";
//        for (int i = str.length()-1; i >=0; i--) {
//            str1 += str.charAt(i);
//        }
//
//        System.out.println(str.equals(str1));


        //140
// String str = "asodfxovbgobnokjhh";
// int index = 0;
// int x = str.indexOf('x');
//

//        for (int i = x; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'o'){
//                index ++;
//            }
//
//        }
//        System.out.println(index);


//141

//        String str = "aasdfgzedhfnfmdzjhfdk";
//int index = 0;
//        int a = str.indexOf('z');
//        int b = str.lastIndexOf('z');
//
//        for (int i = a + 1; i < b; i++) {
//            index++;
//        }
//        System.out.println(index);

//142

//String str = "asdfertarammmgg";
//String str1 = "mghjgnghndhgmd;p";
//int index = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            for (int j = 0; j < str1.length(); j++) {
//                if (str.charAt(i) == str1.charAt(j)){
//                    index ++;
//                }
//
//            }
//        }
//        System.out.println(index);

//143
//    String str = "asdaa"  ;
//    String str2 = "";
//    boolean t ;
//
//        for (int i = 0; i < str.length()-1; i++) {
//           t = true;
//            for (int j = 0; j < str.length(); j++) {
//
//                if (str.charAt(i) == str.charAt(j) && i != j){
//                    t = false;
//                    break;
//                }
//            }
//        if (t == true){
//            str2 += str.charAt(i);
//        }
//        }
//        System.out.println(str2);


// 144

//      String str = "adsdfaghkjh";
//      String str1 = "Aram";
//      String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str1.length(); j++) {
//
//                if (str.charAt(i) == str1.charAt(j)){
//                   tox+=str.charAt(i);
//                }
//            }
//        }
//        System.out.println(tox);

        //145
//        String str = "dkjfahfdakgj";
//        String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a'){
//                tox += str.charAt(i + 1);
//            }
//        }
//        System.out.println(tox);

//146

//String str = "asdsdfaddaaaf";
//String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) != 'a'){
//                tox += str.charAt(i);
//            }
//        }
//
//        System.out.println(tox);


        // 147.

//  String str = "Aramaaaas";
//  String tox = "";
//
//        for ( int i = str.length()-1; i >= 0; i-- ) {
//
//               tox += str.charAt(i);
//
//        }
//
//
//        System.out.println(str);
//        System.out.println(tox);


        //148.

// String str = "aasdfgxfghxtgggx";
// String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != 'x'){
//                tox+=str.charAt(i);
//            }
//        else tox += "yy";
//
//        }
//
//        System.out.println(tox);


        //149

        //        String str = "amdfghjasdk";
        //        String tox = "";
        //
        //
        //
        //        for (int i = 0; i < str.length()-1; i+=2) {
        //            for (int j = i + 1; j < str.length(); j++) {
        //                int x = str.charAt(i);
        //                int y = str.charAt(j);
        //
        //                if (x < y ) {
        //                    tox += str.charAt(i);
        //                    break;
        //
        //                }
        //            }
        //        }
        //        System.out.println(tox);


//150
//        String string1 = "c5dccf"; //length = n
//int count = 0;
//        boolean t = false;
//
//        for (int i = 0; i < string1.length(); i++) {
//            if (string1.charAt(i) == 'x') {
//                t = true;
//                break;
//            }
//
//
//        }
//
//
//        if (t){
//            for (int j = 0; j < string1.length(); j++) {
//                if (string1.charAt(j) == 'c'){
//                    count ++;
//                }
//            }
//        }
//else{
//            for (int k = 0; k < string1.length(); k++) {
//                if (string1.charAt(k) == 'f'){
//                    count++;
//                }
//            }
//        }
//
//
//        System.out.println(count);

//151


//String str = "hjkfhjlfjg";
//String tex = "";
//
//        for (int i = 0; i < str.length(); i+=2) {
//            tex += str.charAt(i);
//            tex += 'a';
//        }
//
//        System.out.println(tex);


//152.
//        String str = "asdgv45672";
//        String tox = "";

//        for (int i = 0; i < str.length(); i++) {
//
//            char x = str.charAt(i);
//            if ( str.indexOf(x) < str.indexOf('v')){
//                tox += x;
//            }
//        }
//
//        System.out.println(tox);

// TARBERAK 2.

//        int x = str.indexOf('v');
//        tox = str.substring(0,x);
//        System.out.println(tox);


////153
//        String str = "aasddf6ghjjlk";
//        int payman = 6;
//        String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (i > payman) {
//                tox += str.charAt(i);
//            }
//
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i == payman) {
//                tox += str.charAt(i);
//            }
//
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i < payman){
//                tox += str.charAt(i);
//            }
//        }
//        System.out.println(tox);

        //TARBERAK 2

//        tox += str.substring(payman +1,str.length());
//        tox += str.charAt(payman);
//        tox += str.substring(0,payman);
//        System.out.println(tox);

//154.
//       String str = "asdfcccfghjk";
//       int count = 0;
//       int index = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'c'){
//                count ++;
//                index += i;
//            }
//
//        }
//        System.out.println(index/count);

// 155.
//        String str = "aaaasdddss";
//        int countA = 0;
//        String tox = "";
//boolean t = false;
////        for (int i = 0; i < str.length(); i++) {
////            if (str.charAt(i) == 'a' && i == str.length()){
////                countA = i;
////            }
////        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 's' && i == str.length()-1){
//                t = true;
//                break;
//            }
//
//        }
//
//        if (t){
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == 's'){
//
//                    countA ++;
//                }
//
//            }
//            System.out.println("S tareri qanak@");
//        }
//        else {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == 'd'){
//
//                    countA ++;
//                }
//
//            }
//            System.out.println("D tareri qanak@");
//        }
//        System.out.println(countA);


        //156.

//  String str1 = "aaaaaaaaaaaaaaaa";
//  String str2 = "bbbbbbbb";
//  String tox = "";
//
//  int midlle = str1.length()/2;
//  tox += str1.substring(0,midlle);
//  tox += str2;
//  tox += str1.substring(midlle);
//        System.out.println(tox);

        //158
//  String str = "asdfzzfdszzzazza";
//  int artadryal = 1;
//  int gumar = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'z'){
//                gumar += i;
//                artadryal *= i;
//            }
//        }
//        System.out.println( "gumar\t" + gumar + "\t\tartadryal\t"+ artadryal);
//159
//    String str = "0123456789";
//
//    String tox = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (i % 3 != 0 ){
//                tox += str.charAt(i);
//            }
//        }
//        System.out.println(tox);


//160
//        String str = "bafbbfabb";
//        String tox = "";
//        int count = 0;
//
//        for (int i = str.length() -1; i >=0; i--) {
//            tox += str.charAt(i);
//        }
//
//        if (str.equals(tox)) {
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == 'a') {
//                    count++;
//                }
//            }
//        } else {
//            for (int k = 0; k < str.length(); k++) {
//                if (str.charAt(k) == 'b') {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);


//161
//        String str = "asdfghjnfnvnefc ffnk";
//        String tox = "";
//
//        for (int i = 1; i < str.length() - 1; i+=2) {
//
//            if ((int) str.charAt(i) < (int) str.charAt(i + 1)
//                    && (int) str.charAt(i) > (int) str.charAt(i - 1)) {
//                tox += str.charAt(i);
//
//                System.out.println( (int) str.charAt(i - 1) + " " +
//                        (int) str.charAt(i) + " " +  (int) str.charAt(i + 1));
//            }
//
//        }
//
//        System.out.println(tox);


// 162
//        Scanner in = new Scanner(System.in);
//        System.out.println("mutqagrel hamar@");
//        int num = in.nextInt();
//
//        if (num > 1000000 && num < 100000) {
//            return;
//        }
//        String num1 = String.valueOf(num);
//
//
//        String ab1 = "Anna vardanyan 260658";
//        String ab2 = "Armen Gevorgyan 256487";
//        String ab3 = "Lilit Gevorgyan 295454";
//        String tox = "";
//        boolean t;
//        for (int i = 0; i < ab1.length(); i++) {
//            t = false;
//            if (ab1.contains(num1)) {
//                tox += ab1.substring(0, ab1.length() - 6);
//                break;
//
//            } else {
//                ab1 = ab2;
//                t = true;
//
//            }
//
//            if (t) {
//
//                if (ab2.contains(num1)) {
//                    tox += ab2.substring(0, ab2.length() - 6);
//                    break;
//                } else {
//                    ab1 = ab3;
//
//                }
//
//            }
//            if (ab3.contains(num1)) {
//                tox += ab3.substring(0, ab3.length() - 6);
//                break;
//
//
//            }
//
//        }
//        System.out.println(tox);


        //163
//String str = "asdfgYxYsdfgjkl";
//String str2 = "aaaaa";
//String tox = "";
//
//       tox =  (str.substring(0,str.indexOf('x')) + str2 + str.substring(str.indexOf('x')+1));
//        System.out.println(tox);


//164
//String tox = "Hovakyan";
//
//boolean t;
//t = tox.contains("yan");
//        System.out.println(t);


        //165
//  String str = "aram Hovakyan" ;
//  String tox = "";

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a'){
//                tox += 'x';
//
//
//            }
//        else {
//            tox += str.charAt(i);
//            }
//
//        }
//        System.out.println(tox);

        // tarberak 2

//        System.out.println(str.replace('a','x'));


        //166

//String str = "Aramaaaasadmabdfkj ab";
//
//        System.out.println(str.replace("ab",""));
//        System.out.println(str.replace('a','b'));
//        System.out.println(str.replaceAll("Aram","sd"));

//167
//     String str = "Aa";
//        System.out.println(str.codePointAt(1));

//168

//String str = "AaaaAaaajkjhfdflk";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.codePointAt(i) == 65){
//                System.out.println(str.charAt(i));
//            }
//        }

//169
//String str = "asdlkaAaghds";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.codePointAt(i)  == 65){
//                System.out.println(str.codePointAt(i-1) + " " + (int) str.charAt(i+1));
//            }
//        }

//170
//      int n = 5;
//      int x = 0;
//        for (char i = 'a'; i < 'z'; i++) {
//            x++;
//            if (x <= n){
//                System.out.println(i);
//            }
//        }
//      //______________________________
//        int N = 15;
//        for(char i = 'a'; i < 'a'+N; i++ )
//            System.out.print(i +" ");

        //171
//int n = 5;
//        for (char i = 'z' ; i > 'z' - n ; i--) {
//            System.out.println(i);
//
//        }

//172
//String tox = "a";
//int a = 0;
//
//        for (int i = 0; i < tox.length(); i++) {
//            if (tox.codePointAt(i) < 'a'){
//                a = 1 ;
//            }
//
//       if (tox.codePointAt(i) >= 'A' && tox.codePointAt(i) <= 'Z'){
//           a = 2;
//       }
//
//       else if (tox.codePointAt(i) >= 'a' && tox.codePointAt(i) <= 'z'){
//           a = 3;
//       }
//
//        }
//
//        System.out.println(a);


//173

//String str = "asdfA";
//
//        System.out.println(str.codePointAt(0) + " " + str.codePointAt(str.length()-1));

//174
//
//        int x = 45;
//        String str = "";
//
//        System.out.println(str += str.valueOf(x));


//175
//        int n = 10;
//        char a = 'x';
//        char b = 'y';
//        String str = "";
//
//        for (int i = 0; i < n; i++) {
//str += a;
//str += b;
//
//        }
//        System.out.println(str);


        //176

// String str = "asdfgh";
// String tox = "";
//
// for (int i = 0; i < str.length(); i++) {
//            tox += str.charAt(i);
//            tox += " ";
//        }
//
//        System.out.println(tox);


//177

//int n = 5;
//String str = "asdfghjkl";
//String tox =  "";
//String ket = ";";
//
//        for (int i = 0; i < str.length(); i++) {
//            tox += str.charAt(i);
//
//            for (int j = 0; j < n; j++) {
//            tox += ket;
//
//            }
//        }
//
//        System.out.println(tox);

//178
//   String str = "asd123";
//   int num = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if (Character.isDigit(str.charAt(i))){
//                num ++;
//            }
//        }
//
//        System.out.println(num); // patasxan 3

//179
//String str = "asdABCasd";
//
//int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//
//            if ((str.charAt(i)) <= 'Z' ){
//                count++;
//            }
//
//        }
//
//        System.out.println(count);
//180
//String str = "asddfgAABBNN";
//String tox = "";
//
//
//
//            tox += str.toUpperCase();
//
//        System.out.println(tox);

//181
//
//String str = "asdjhgftrgdANBHGFV";
//String tox = "";
//
//tox += str.toLowerCase();
//        System.out.println(tox);


        //182
//      String str = "1.2";
//      String tox = "";
//        int x = 0;
//
//        int t = 1;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) < '0' && str.charAt(i) > '9' && str.charAt(i) != '.'){
//                t = 3;
//
//            }
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '.' && t == 1){
//                t = 2;
//            }
//        }
//        System.out.println(t);

        //183
//      int tiv = 123;
//
//        System.out.println(tiv%10 + " " + tiv/10%10 + " " + tiv/100 );

//184
//int tiv = 245;
//        System.out.println(tiv%10 + tiv/10%10 + tiv/100);


//        185
//        String str = " 6 + 4 - 5 + 1 ";
//        String tox = str.replace(" ", "");
//
//        int x = Integer.parseInt(Character.toString(tox.charAt(0)));
//        for (int i = 1; i < tox.length(); i ++) {
//
//                if (tox.charAt(i) == '+') {
//                    x += Integer.parseInt(Character.toString(tox.charAt(i+1)));
//
//                }
//            if (tox.charAt(i) == '-') {
//                    x -= Integer.parseInt(Character.toString(tox.charAt(i+1)));
//
//
//            }
//        }
//
//        System.out.println(x);

//186
//        String str = "asdfgXdfg";
//        String str1 = "aaaaaaaa";
//        String ttt = "";
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'X') {
//
//                ttt += str.substring(0, i);
//                ttt += str1;
//                ttt += str.substring(i+1);
//            }
//        }
//        System.out.println(ttt);


//187
//String str = "asdfAramasdfAram";
//String tox = "Aram";
//String tox1 = "";
//int x = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            tox1 += str.charAt(i);
//            if (tox1.contains(tox)){
//                x ++;
//                tox1 = "";
//            }
//        }
//        System.out.println(x);


//189
//String str = " a ";
//
//        System.out.println(str.trim());

//190

//    String str = " a b c d ";
//    String x = "";
//
//    str = str.replaceAll(" ", "");
//
//        x += str.charAt(0);
//        x += str.charAt(str.length()-1);
//        System.out.println(x);


//191

//String str = " asd    asd    asd         sdf djfh      fdkjlk   ";
//String tox = "";
//int x = 1;
//        for (int i = 0; i < str.length(); i++) {
//            str = str.replaceAll("  ", " ");
//            str = str.trim();
//
//        if (str.charAt(i) == ' '){
//            x ++;
//
//            }
//        }
//
//
//        System.out.println(x);

//192

//        String str = "Aram hsd   sddfg      gfgg  Aram     dsdc";
//
//        str = str.trim();
//
//
//        int x = 1;
//        for (int f = 0; f < str.length(); f++) {
//            str = str.replaceAll("  ", " ");
//        }
//        String [] tox = str.split(" ");
//
//        for (int i = 0; i < tox.length; i++) {
//            for (int j = i+1; j <tox.length; j++) {
//
//                if (tox[i].charAt(0) == (tox[j].charAt(0))){
//                    x ++;
//                }
//
//
//            }
//        }
//
//        System.out.println(x);


//        // <Aram@gmail.comkjjkhjkh
//        String[] comeri = {"com", "ru"};
//        String[] host = {"gmail", "mail"};
//        String itog = "";
//        String mimas = "";
//        int shnik = 0;
//        int ket = 0;
//        int comerii = 0;
//        int hosti = 0;
//        int hasce = 0;
//
//        boolean t = false;
//
//        Scanner in = new Scanner(System.in);
//        String input = in.next();
//
//        for (int i = 0; i < input.length(); i++) {
//// stugum enq @ nshan@
//            if (input.charAt(i) == '@') {
//                shnik++;
//                t = true;
//            }
//
////stugum enq '.' nshan@
//            if (t) {
//                if (input.charAt(i) == '.') {
//                    ket++;
//
//                    for (int j = 0; j < host.length; j++) {
//
//                        if (input.substring(input.indexOf('@')+1, input.indexOf('.')).equals(host[j])
//                        ) {
//                            hosti++;
//                            break;
//                        }
//                    }
//                    for (int k = 0; k < comeri.length; k++) {
//
//                        if (input.substring(input.indexOf('.')).contains(comeri[k])) {
//                            comerii++;
//                            break;
//                        }
//                    }
//                    if (input.substring(input.indexOf('.')).contains("com")) {
//                        mimas = comeri[0];
//
//                    } else if (input.substring(input.indexOf('.')).contains("ru")) {
//                        mimas = comeri[1];
//                    }
//                }
//            }
//        }
//// error patasxanner
//        if (shnik == 0) {
//            System.out.println("մուտքագրեք '@'");
//            System.exit(0);
//        }
//        if (ket == 0) {
//            System.out.println("մուտքագրեք '.'");
//            System.exit(0);
//        }
//        if (comerii == 0) {
//            System.out.println("մուտքագրեք 'com/ru'");
//            System.exit(0);
//        }
//        if (hosti == 0) {
//            System.out.println("մուտքագրեք 'gmail/mail'");
//            System.exit(0);
//        }
//// toxi mshakman proces
//        if (input.charAt(0) == '<') {
//
//            itog += input.substring(input.indexOf(input.charAt(1)), input.indexOf('.')+1);
//            itog += mimas;
//
//            if (itog.substring(itog.indexOf('@')).equals("@gmail.com")) {
//                System.out.println(itog);
//                hasce++;
//
//            }
//
//            if (itog.substring(itog.indexOf('@')).equals("@mail.ru")) {
//                System.out.println(itog);
//                hasce++;
//            }
//            if (hasce == 0) {
//                System.out.println("մուտքագրեք ճիշտ հասցե,");
//            }
//
//        }

/////////////////FILTR////////////////////////

//        ///բազա
//        String[] baza = {"ArmanHarutyunyan093939393",
//                "AnnaSerobyan099999999",
//                "VazgenDanielyan041414141",
//                "AramHovakyan003466393362"};
//
//        String number = "";
//        String zro = "";
//
//        // Պատասխաններ
//
//        String vivacel = "**********Օպերատոր Վիվասել*************";
//        String beeline = "**********Օպերատոր Բիլայն**********";
//        String Orange = "**********Օպերատոր Օրանժ**********";
//        String Espana = "**********Օպերատոր Իսպանիա**********";
//
//        while (0 < 1) {
//            Scanner in = new Scanner(System.in);
//
////            String input ="AramHovakyan";
//
//            String input = in.next();
//
//
//            if (input.charAt(0) == '+') {
//                System.out.println("Խնդրում ենք մուտքագրել 00");
//                System.exit(0);
//            }
//
//            for (int i = 0; i < baza.length; i++) {
//
//
//                for (String Newbaza : baza[i].split("0")) {
//
//// Stugum @st Anvan
//                    if ((input + "0" + Newbaza).equals(baza[i])) {
//
//                        if ((input + "0" + Newbaza).matches("(.*)093(.*)")) {
//                            number = vivacel;
//                        }
//                        if ((input + "0" + Newbaza).matches("(.*)099(.*)")) {
//                            number = beeline;
//                        }
//                        if ((input + "0" + Newbaza).matches("(.*)041(.*)")) {
//                            number = Orange;
//                        }
//
//
//                        System.out.println(number);
//                        System.out.println("\t\t\t0" + Newbaza);
//                        System.out.println("\t\t\t" + input);
//
//
//                        //Stugum @st hamari
//                    } else if ((Newbaza + input).equals(baza[i])) {
//
//                        if ((input + "0" + Newbaza).matches("(.*)093(.*)")) {
//                            number = vivacel;
//                        }
//                        if ((input + "0" + Newbaza).matches("(.*)099(.*)")) {
//                            number = beeline;
//                        }
//                        if ((input + "0" + Newbaza).matches("(.*)041(.*)")) {
//                            number = Orange;
//                        }
//
//                        System.out.println(number);
//                        System.out.println("\t\t\t" + input);
//                        System.out.println("\t\t\t" + Newbaza);
//
//
//                    }
//
//                    //Artasahmanyan Operatorner
//
//
////HAMAROV
//                    if ((Newbaza + input).equals(baza[i]) && (input + "0" + Newbaza).matches("(.*)0034(.*)")) {
//
//
//                            number = Espana;
//
//
//                        System.out.println(number);
//                        System.out.println("\t\t\t" + input);
//                        System.out.println("\t\t\t" + Newbaza);
//
//
//                        // // anvanumov
//
//                        }
//                    }
//
//                }
//
//            }


        //////NEW//////////Filtr///////////////////

        String[] baza = {"AnnaHArutyunyan093656065",
                "AramHovakyan091454545",
                "VazgenGevorgyan041787878",
                "GalustSahakyan0034454545"};

        String[] BazaOperators = {"091", "093", "041", "0034"};

        String viva = "***Operator Vivacell***";
        String Beeline = "***Operator Beeline***";
        String orange = "***Operator Orange***";
        String Espana = "***Operator Espana***";
        String operator = "";
        String number = "";
        String name = "";
        String zipcode = "";
        String user1 = "aram";
        String password1 = "Aram123";
        int crash = 0;
        int crash1 = 0;
        int crash2 = 0;

        Scanner in = new Scanner(System.in);
        while (crash < 3) {
            System.out.println("Մուտքագրեք գաղտնաբառը");

            System.out.println("user");
            String user = in.next().toLowerCase();
            System.out.println("password");
            String password = in.next();


            if (user.equals(user1) && password.equals(password1)) {

                while (0 < 3) {
if (crash1 == baza.length || crash2 == BazaOperators.length){
    System.out.println("Տվյալները բացակայում են");
    System.out.println("------------------------");
}

                    System.out.println("Մուտքագրեք տվյալները հեռ/Ա․Ա");
                    String input = in.next();


//////Voronum ANUNOV
                    for (int i = 0; i < baza.length; i++) {
                        if (Character.isLetter(input.charAt(0))) {

                            if (baza[i].substring(0, input.length()).toUpperCase().equals(input.toUpperCase())) {
                                name = input;

                                number = baza[i].substring(name.length());


                                for (int j = 0; j < BazaOperators.length; j++) {

                                    if ((number.substring(0, BazaOperators[j].length())).equals(BazaOperators[j])) {
                                        zipcode = BazaOperators[j];
                                    }
                                }

                            } else {
                                crash1++;

                            }
                        }

// voronum@ HAMAROV
                        else if (Character.isDigit(input.charAt(0))) {
                            if (baza[i].substring(baza[i].length() - input.length()).equals(input)) {
                                number = input;

                                name = baza[i].substring(0, baza[i].length() - number.length());


                                for (int j = 0; j < BazaOperators.length; j++) {

                                    if ((number.substring(0, BazaOperators[j].length())).equals(BazaOperators[j])) {
                                        zipcode = BazaOperators[j];
                                    }
                                }
                            } else {
                                crash2++;
                            }
                        }


                    }

                    if (zipcode == "093") {
                        operator = viva;
                    }
                    if (zipcode == "091") {
                        operator = Beeline;
                    }
                    if (zipcode == "041") {
                        operator = orange;
                    }
                    if (zipcode == "0034") {
                        operator = Espana;
                    }


                System.out.println(operator);
                System.out.println("\t" + number);
                System.out.println("\t" + name.toUpperCase());
                System.out.println("------------------------");
                name = "";
                number = "";
                operator = "";
            }


        }


            if (user != (user1) || password != (password1)) {
                System.out.println("Սխալ Անուն կամ գաղտնաբառ ");
                crash++;
            }

        }

    }
}


