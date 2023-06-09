package ru.synergy;

import java.util.*;

public class Main {
    public static void main(String[] args){
//Arrays
       /* Cat[] cats = new Cat[3];
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

        catsList.add(new Cat("Бегемот"));// добовляет запись в массив
        //catsList.remove(1); // удаляем запись из массива

        Cat cat = catsList.get(0);
        System.out.println(cat);
        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Меня сюда вставили"));

        //catsList.removeAll(Arrays.asList(cat, catsList.get(3))); // удаляет выбранные записи
        // как по имени переменной так и по индексу

        System.out.println(catsList.toString());
        System.out.println(catsList.size());*/

// LinkedList
       /* String str1 = new String("Hello world");
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

        System.out.println(olegBio);*/

        // Linked List on practice
      /*  LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Spider");
        Car bugatti = new Car("Verona");
        Car mercedes = new Car("Mercedes Benz");

        cars.addAll(Arrays.asList(ferrari, bugatti, mercedes));
        System.out.println(cars);

        cars.addFirst(new Car("Ford gt300"));
        cars.addLast(new Car("Fiat"));

        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars);*/

// ArrayList vs LinkedList
       /* List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++){
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }
        System.out.println("Время работы для LinkedList в (миллисекундах)"
                + (System.currentTimeMillis() - start));

        list = new ArrayList<>();
        for (int i = 0; i < 5000000; i++){
            list.add(new Integer (i));
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для ArrayList в (миллисекундах)"
                + (System.currentTimeMillis() - start));*/

// TreeSet / HashSet
       /* Set<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAdded = states.add("Italy");
        System.out.println("Italy is added: " + isAdded);
        System.out.println("Set contains: " + states.size());
        System.out.println(states);

        states.remove("Germany");
        System.out.println(states);

        HashSet<Cat> catsHashSet = new HashSet<>(catsList);
        System.out.println(catsHashSet);

        TreeSet<Cat> catsTreeSet = new TreeSet<>(catsList);
        System.out.println(catsTreeSet);*/

//Map
        Map<Integer, String> statesMap = new HashMap<>();

        statesMap.clear();
        statesMap.put(1, "Germany");
        statesMap.put(2, "Spain");
        statesMap.put(3, "France");
        statesMap.put(4, "Italy");

        System.out.println(statesMap.keySet());

        statesMap.remove(1);

        for (Map.Entry<Integer, String> item : statesMap.entrySet()){
            System.out.printf("| Key: %d   | Value: %s\n", item.getKey(), item.getValue());
        }

        String first = statesMap.get(1);
        System.out.println(first);




//        System.out.println(statesMap.values());
//        System.out.println(statesMap.keySet());





    }
}
