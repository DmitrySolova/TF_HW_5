/**
 * Класс, окрашивает введенный текст в выбранный цвет
 *
 * @author Дмитрий JavaRin
 * @version 1.0 26.10.2019
 */

package com.company;

final class Utils {
    static void print(final String text, final String color) {
        System.out.println(Color.getColorAnsi(color)
                + text
                + Color.colorReset());
    }
}
