/**
 * Стандартный класс для начала работы
 * @author Дмитрий JavaRin
 * @version 1.0 26.10.2019
 */
package com.company;

class Main {

    public static void main(final String[] args) {

        // Part 1

        Box<Double> box1 = new Box<>();

        box1.setInBox(1.232);

        box1.removeFromBox(); //удаляем обьект из коробки
        box1.removeFromBox(); //пробуем удалить из пустой коробки

        Box<String> box2 = new Box<>();

        box2.setInBox("sfsfsf");
        box2.setInBox("112312"); //в коробке уже что-то

        box2.getOutBox(); //забираем из коробки обьект
        box2.getOutBox(); //пробуем забрать из пустой коробки

        // Part 2

        Utils<Integer, String, Double> utils1 = new Utils<>();
        Object box3 = utils1.getBox(125);
        System.out.println(((Box) box3).getOutBox()); //??

        for (int i = 0; i < 10; i++) {
            System.out.println(utils1.getRandomObject(777, "АЗАЗА21", 9.2)); //выводим рандомный обьект в консоль
        }

    }
}
