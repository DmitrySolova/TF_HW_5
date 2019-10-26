/**
 * Enam, хранящий в себе цвета в кодировке ansi.
 * Этот enam может получать ansi-значение выбранного цвета,
 * а также может случайно выдавать хранящийся в ним цвет.
 *
 * @author Дмитрий JavaRin
 * @version 1.0 26.10.2019
 */

package com.company;

public enum Color {
    /** Черный. */
    BLACK("\u001B[30m"),
    /** Красный. */
    RED("\u001B[31m"),
    /** Зеленый. */
    GREEN("\u001B[32m"),
    /** Желтый. */
    YELLOW("\u001B[33m"),
    /** Синий. */
    BLUE("\u001B[34m"),
    /** Фиолетовый. */
    PURPLE("\u001B[35m"),
    /** Циан. */
    CYAN("\u001B[36m"),
    /** Белый. */
    WHITE("\u001B[37m");
    /** Цвет с которым мы будем работать. */
    private final String colorAnsi;

    Color(final String colorAnsi) {
        this.colorAnsi = colorAnsi;
    }

    /** Метод, возвращающий сброс цвета для "потока" строки (ставится в конце).
     *  @return Возвращает строку для сброса цвета.
     */
    public static String colorReset() {
        return "\u001B[0m";
    }

    /** Метод принимает строку для поиска,
     *  ищет ее на английском и на руссом и выдает ее ansi-кодировку.
     *  @param stringColor - Строка для поиска
     *  @return Возвращает ansi-строку для нужного цвета.
     */
    public static String getColorAnsi(final String stringColor) {

        if (stringColor.equalsIgnoreCase("черный")
                || stringColor.equalsIgnoreCase("black")) {
            return BLACK.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("красный")
                || stringColor.equalsIgnoreCase("red")) {
            return RED.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("зеленый")
                || stringColor.equalsIgnoreCase("green")) {
            return GREEN.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("желтый")
                || stringColor.equalsIgnoreCase("yellow")) {
            return YELLOW.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("синий")
                || stringColor.equalsIgnoreCase("blue")) {
            return BLUE.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("фиолетовый")
                || stringColor.equalsIgnoreCase("purple")) {
            return PURPLE.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("циан")
                || stringColor.equalsIgnoreCase("cyan")) {
            return CYAN.colorAnsi;
        }
        if (stringColor.equalsIgnoreCase("белый")
                || stringColor.equalsIgnoreCase("white")) {
            return WHITE.colorAnsi;
        }

        return null;
    }

    /** Метод выдает случайное значение цвета. */
        public static void getRandomColor() {
        int max = Color.values().length;
        int randomInt = (int) (Math.random() * (max));

        Color colorText = Color.values()[randomInt];
        String text = colorText.toString();
        System.out.println(colorText.colorAnsi + text + Color.colorReset());
    }
}


