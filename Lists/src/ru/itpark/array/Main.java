package ru.itpark.array;

public class Main {

    public static void main(String[] args) {

        IntegerArrayList arrayList = new IntegerArrayList();
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        ObjectsArrayList humansObjectsList = new ObjectsArrayList();

        Human marsel = new Human("Marsel", 23);
        Human regina = new Human("Regina", 19);
        Human alina = new Human("Alina", 18);

        humansObjectsList.add(marsel);
        humansObjectsList.add(alina);
        humansObjectsList.add(regina);

        System.out.println(humansObjectsList.get(0));
        System.out.println(humansObjectsList.get(1));
        System.out.println(humansObjectsList.get(2));

        ObjectsArrayList rectanglesObjectsList = new ObjectsArrayList();
        Rectangle a = new Rectangle(2, 3);
        Rectangle b = new Rectangle(1, 2);
        Rectangle c = new Rectangle(4, 3);

        rectanglesObjectsList.add(a);
        rectanglesObjectsList.add(b);
        rectanglesObjectsList.add(c);

        System.out.println(rectanglesObjectsList.get(0));
        System.out.println(rectanglesObjectsList.get(1));
        System.out.println(rectanglesObjectsList.get(2));

        Human reginaFromList = (Human)humansObjectsList.get(1);
        System.out.println(reginaFromList);

        humansObjectsList.add(b);
//        Human someHumanFromList = (Human)humansObjectsList.get(3);

        ArrayList<Human> humanArrayList = new ArrayList<>();
        humanArrayList.add(marsel);
        humanArrayList.add(regina);
        humanArrayList.add(alina);
        // humanArrayList.add(a);

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<>();
        rectangleArrayList.add(a);
        rectangleArrayList.add(b);
        // rectangleArrayList.add(regina);

        Human marselFromList = humanArrayList.get(0);

    }
}
