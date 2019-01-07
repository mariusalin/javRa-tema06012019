package com.company;

public class Main {
    public static void main(String[] args) {
        String rolyText = "Long long ago, in a galaxy far, far away!";
        int delay = 2000;
        for (int i = 0; i < rolyText.length(); i++) {
            long start = System.currentTimeMillis();
            while (start >=System.currentTimeMillis() - delay) {

            }
            System.out.print(rolyText.charAt(i));
            //System.out.println(System.currentTimeMillis());

        }


    }
}

