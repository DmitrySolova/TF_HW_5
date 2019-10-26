/**
 * Класс Box (коробка) с дженериком, указывающая на тип объекта,
 * который в эту коробку можно положить.
 * @author Дмитрий JavaRin
 * @version 1.0 26.10.2019
 */

package com.company;

public class Box<Type> {
    /** Заданный обьект. */
    private Type object;

    /**
     * Метод кладет обьект в коробку (с проверкой)
     * @param object - выбранный обьект, любой.
     */
    public final void setInBox(final Type object) {
        if (this.object != null) {
            System.out.println("В коробке уже что-то есть, это - " + this.object.toString());
        } else {
            this.object = object;
            System.out.println("Коробка пустая! Кладем туда - " + object.toString());
        }
    }

    /**
     * Метод вынимает обьект из коробки (с проверкой)
     * @return Возвращает обьект из коробки.
     */
    public Type getOutBox() {
        if (object == null) {
            System.out.println("Нечего взять из коробки - она пустая!");
        } else {
            Type object = this.object;
            this.object = null;
            System.out.println("Забираем обьект из коробки - " + object.toString());
            return object;
        }
        return null;
    }

    /**
     * Метод удаляет обьект из коробки (с проверкой)
     */
    public void removeFromBox() {
        if (object == null) {
            System.out.println("Нечего удалить из коробки - она пустая!");
        } else {
            System.out.println("В коробке лежит - " + this.object.toString() + " , удаляем его");
            this.object = null;
        }
    }
}
