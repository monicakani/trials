package com.navis.com.navis.generics;

import java.util.Arrays;

public class arrytest {
    public static void main(String[] args)
    {
        int[] ranks= new int[5];
        ranks[0]=3;
        ranks[1]=1;
        ranks[2]=2;
        ranks[3]=6;
        ranks[4]=7;
        //ranks[0]=3;
        Arrays.sort(ranks);
        System.out.println(Arrays.binarySearch(ranks,5));
    }
}
