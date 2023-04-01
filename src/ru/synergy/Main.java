package ru.synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
//Arrays
        /*Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");
        //cats[3] = new Cat("Котяра"); // нельзя добавить запись т.к. размер массива 3
        //cats[0] = null; // можно присвоить нулевое значение
        System.out.println(Arrays.toString(cats));*/

// создаем динамический массив
       /* ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats){
            catsList.add(cat);
        }

        catsList.add(new Cat("Бегемот2"));// добовляет запись в массив
        catsList.remove(1); // удаляем запись из массива

        Cat cat = catsList.get(0);
        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3))); // удаляет выбранный записи
        // как по имени переменной так и по индексу

        System.out.println(catsList.toString());
        System.out.println(catsList.size());*/

// LinkedList
        String str1 = new String("Hello world");
        String str2 = new String("My name is Oleg");
        String str3 = new String("I love Java");

        LinkedList<String> olegBio = new LinkedList<>();
        olegBio.add(str1);
        olegBio.add(str2);
        olegBio.add(str3);

        System.out.println(olegBio);

        olegBio.remove(1);
        olegBio.add(new String("Новая строка в Bio"));
        olegBio.addFirst(new String("Добавим строку в начало"));
        olegBio.addLast(new String("Добавим строку в конец Bio"));
        olegBio.remove(3);
        olegBio.add(2, "Добавим на третье место");

        System.out.println(olegBio);
    }
}
