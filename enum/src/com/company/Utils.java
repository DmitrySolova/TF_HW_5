package com.company;

public class Utils {

    public static void print(String text){
        System.out.println(text);
    }

    public static void print(String text, String color){
        System.out.println(Color.getColorAnsi(color) + text + Color.colorReset());
    }
}
