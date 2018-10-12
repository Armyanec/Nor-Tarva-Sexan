package com.company.receptner;

import java.util.Scanner;

public class Exchange {

    public int input1;
    public String operation;
    public int patasxan;


    Scanner in = new Scanner(System.in);



    public void setIn(Scanner in) {
        this.in = in;
    }

    public void setInput1() {
        this.input1 = in.nextInt();
    }

    public void setOperation() {
        this.operation = in.next();
    }


    public void setPatasxan() {

        switch (operation){

            case "dollar": patasxan = input1 * 487; break;
            case "euro": patasxan = input1 * 562;break;
            case  "rus": patasxan = input1 * 8;break;
            default:

        }


    }

    public int getPatasxan() {
        return patasxan;
    }
public String getOperation(){
        return operation;
}


}
