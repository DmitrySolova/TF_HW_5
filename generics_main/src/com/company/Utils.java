/**
 * Utils - класс с некоторыми функциями для взаимодействия с коробкой
 * @author Дмитрий JavaRin
 * @version 1.0 26.10.2019
 */

package com.company;

public class Utils<T1, T2, T3> {

    /**
     * Метод создает новую коробку.
     * @param object - выбранный обьект, любой.
     * @return Возвращает созданную коробку с обьектом.
     */
    public final Object getBox(final T1 object) {
        Box<T1> boxName = new Box<>();
        boxName.setInBox(object);
        return boxName;
    }

    /**
     * Метод отдает случайный обьект из 3 заданных.
     * @param object1 - выбранный обьект, любой.
     * @param object2 - выбранный обьект, любой.
     * @param object3 - выбранный обьект, любой.
     * @return Возвращает случайный обьект.
     */
    public final Object getRandomObject(final T1 object1,
                                  final T2 object2, final T3 object3) {
        Object[] randomObjects = new Object[3];
        randomObjects[0] = object1;
        randomObjects[1] = object2;
        randomObjects[2] = object3;

        int max = randomObjects.length;
        int randomInt = (int) (Math.random() * (max));

        return randomObjects[randomInt];
    }
}
