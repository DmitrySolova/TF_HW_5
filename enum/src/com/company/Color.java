package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum Color {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    String colorAnsi;

    Color(String colorAnsi) {
        this.colorAnsi = colorAnsi;
    }

    public static String colorReset() {
        return "\u001B[0m";
    }

    public static String getColorAnsi(String stringColor) {

        if(stringColor.equalsIgnoreCase("черный") | stringColor.equalsIgnoreCase("black")){
            return BLACK.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("красный") | stringColor.equalsIgnoreCase("red")){
            return RED.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("зеленый") | stringColor.equalsIgnoreCase("green")){
            return GREEN.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("желтый") | stringColor.equalsIgnoreCase("yellow")){
            return YELLOW.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("синий") | stringColor.equalsIgnoreCase("blue")){
            return BLUE.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("фиолетовый") | stringColor.equalsIgnoreCase("purple")){
            return PURPLE.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("циан") | stringColor.equalsIgnoreCase("cyan")){
            return CYAN.colorAnsi;
        }
        if(stringColor.equalsIgnoreCase("белый") | stringColor.equalsIgnoreCase("white")){
            return WHITE.colorAnsi;
        }

        return null;
    }

    public static void getRandomColor(){
        int max = Color.values().length;
        int randomInt = (int)(Math.random() * (max));

        Color colorText = Color.values()[randomInt];
        String text = colorText.toString();
        System.out.println(colorText.colorAnsi + text + Color.colorReset());
    }
}


