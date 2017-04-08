package ru.itpark;

public class Human implements Comparable {
    private int id;
    private String name;
    private int age;

    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Функция сравнения
     * @param object объект, с которым нужно сравнить
     * @return отрицательное значение, если сравниваемый объект меньше that
     * 0 - если объекты равны
     * положительное - если объект больше
     */
    public int compareTo(Object object) {
        if (object instanceof Human) {
            Human that = (Human)object;
            return this.age - that.age;
        } else {
            System.err.println("Cannot cast to Human");
            return 0;
        }
    }
}
