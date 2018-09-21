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

//    int n = 1232896;
//    int sum = 0;
//
//    while (n > 0){
//        n = n/10;
//        sum++;
//    }
//
//        System.out.println(sum);
//


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

        Scanner in = new Scanner(System.in);
        String input = in.next().toString();


        String input1 = input.replaceAll("fack","xxx");
        System.out.println(input1);

    }



}