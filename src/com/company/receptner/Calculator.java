package com.company.receptner;

import java.util.Scanner;

public class Calculator {
//public String nam;
//public  int age;
//    Scanner in = new Scanner(System.in);
//
//
//    public String getNam() {
//        return nam;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//public  void  setNam (){
//
//        if (in.next().equals("Aram")) {
//            this.nam = "Hovakyan";
//        }
//    }
//public void  setAge (){
//
//            this.age = in.nextInt();
//        }

    public char operation;
    public int input1;
    public int input2;
    public int patasxan;

    public int exchang;
    public String calculator;

    Scanner in = new Scanner(System.in);

        public void setInput1 () {
            this.input1 = in.nextInt();
        }
        public void setInput2 () {
            this.input2 = in.nextInt();
        }

        public void setOperation () {
            this.operation = in.next().charAt(0);
        }

        public void setPatasxan () {

            switch (operation) {

                case '+':
                    this.patasxan = input1 + input2;
                    break;
                case '-':
                    this.patasxan = input1 - input2;
                    break;
                case '*':
                    this.patasxan = input1 * input2;
                    break;
                case '/':
                    this.patasxan = input1 / input2;
                    break;
default:
            }


        }

        public int getPatasxan () {
            return patasxan;
        }


    }



