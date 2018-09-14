package com.company.receptner;

import java.util.Arrays;

public class Masivner {
    public static void main(String[] args) {

        int[] array = {5,4,1,3,2,0,11};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                int temp = array[i];

                if (array[i] > array[j]){

                    array[i] = array[j];
                    array[j] = temp;


                }


            }

        }
        System.out.println(Arrays.toString(array));
    }
}
