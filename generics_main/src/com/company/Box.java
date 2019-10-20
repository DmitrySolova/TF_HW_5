package com.company;

public class Box<Type> {
    Type object;

    public void setInBox(Type object){
        if (this.object != null){
            System.out.println("В коробке уже что-то есть, это - " + this.object.toString());
        } else {
            this.object = object;
            System.out.println("Коробка пустая! Кладем туда - " + object.toString());
        }
    }
    public Type getOutBox(){
        if (object == null){
            System.out.println("Нечего взять из коробки - она пустая!");
        } else {
            Type object = this.object;
            this.object = null;
            System.out.println("Забираем обьект из коробки - " + object.toString());
            return object;
        }
        return null;
    }
    public void removeFromBox(){
        if (object == null){
            System.out.println("Нечего удалить из коробки - она пустая!");
        } else {
            System.out.println("В коробке лежит - " + this.object.toString() + " , удаляем его");
            this.object = null;
        }
    }
}
