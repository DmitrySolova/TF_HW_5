package com.company;

public class Utils<T1, T2, T3> {

    public Object getBox(T1 object){
        Box<T1> boxName = new Box<>();
        boxName.setInBox(object);
        return boxName;
    }

    public Object getRandomObject(T1 object1, T2 object2, T3 object3){
        Object[] randomObjects = new Object[3];
        randomObjects[0] = object1;
        randomObjects[1] = object2;
        randomObjects[2] = object3;

        int max = randomObjects.length;
        int randomInt = (int)(Math.random() * (max));

        return randomObjects[randomInt];
    }
}
