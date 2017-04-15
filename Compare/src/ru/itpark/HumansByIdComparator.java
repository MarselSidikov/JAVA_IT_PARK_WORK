package ru.itpark;

public class HumansByIdComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.getAge() - b.getAge();
    }
    /*
    @Override
    public int compare(Object a, Object b) {
        if (a instanceof Human && b instanceof Human) {
            Human aHuman = (Human)a;
            Human bHuman = (Human)b;

            return aHuman.getId() - bHuman.getId();
        } else {
            System.err.println("Cannot cast to Human");
            return 0;
        }
    }*/
}
