package ru.itpark;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
	    Class humanClass = Human.class;
	    Field publicFieldsOfHuman[] = humanClass.getFields();

        for (int i = 0; i < publicFieldsOfHuman.length; i++) {
            System.out.println(publicFieldsOfHuman[i]);
        }

        Field allHumanFields[] = humanClass.getDeclaredFields();

        for (int i = 0; i < allHumanFields.length; i++) {
            System.out.println(allHumanFields[i]);
        }

        // получить экземпляр класса

        Human human = (Human)humanClass.newInstance();
        Field ageField = humanClass.getDeclaredField("age");

        Human marsel = new Human(23, "Marsel", 1666);
        ageField.setAccessible(true);
        ageField.set(marsel, -100);
        System.out.println(marsel.getAge());



    }
}
