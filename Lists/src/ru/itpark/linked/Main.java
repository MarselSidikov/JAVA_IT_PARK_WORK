package ru.itpark.linked;

import ru.itpark.array.Human;

import java.util.Iterator;

/**
 * Created by Student21 on 22.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human regina = new Human("Regina", 19);
        Human alina = new Human("Alina", 18);
        Human ruslan = new Human("Ruslan", 25);
        Human ilyas = new Human("Ilyas", 20);

        LinkedList<Human> list = new LinkedList<>();
        list.addLast(ilyas);
        list.addFirst(ruslan);
        list.addFirst(marsel);
        list.addFirst(regina);
        list.addFirst(alina);

        for (int i = 0; i < list.getCount(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Human> humanIterator = list.iterator();

        while (humanIterator.hasNext()) {
            Human human = humanIterator.next();
            System.out.println(human);
        }

        for (Human human : list) {
            System.out.println(human);
        }
    }
}
