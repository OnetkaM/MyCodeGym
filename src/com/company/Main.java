package com.company;

public class Main {

    public static void main(String[] args) {
        class Solution {
            public void main(String[] args) {
                wyswietlNajblizszaDziesiatce(8, 11);
                wyswietlNajblizszaDziesiatce(7, 14);
            }

            public void wyswietlNajblizszaDziesiatce(int a, int b) {
                if (abs(10 - a) < abs(10 - b))
                    System.out.println(a);
                else

                    System.out.println(b);

            }

            public int abs(int a) {
                if (a < 0) {
                    return -a;
                } else {
                    return a;
                }
            }
        }
    }
}


