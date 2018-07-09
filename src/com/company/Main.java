package com.company;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int j;
        for (int i = 0; i < 10000000; i++){
            j = i;
            System.out.println(j);
        }

        double currTime = (((double)System.currentTimeMillis() - (double)startTime)/1000);
        System.out.println("Время выполнения программы = " + currTime);
    }
}
