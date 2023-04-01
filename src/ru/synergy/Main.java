package ru.synergy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//Arrays
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");

        //cats[3] = new Cat("Котяра"); // нельзя добавить запись т.к. размер массива 3

        //cats[0] = null; // можно присвоить нулевое значение

        System.out.println(Arrays.toString(cats));
    }
}
