/**
 * Created by User on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human alina = new Human("Alina", 18);
        Human regina = new Human("Regina", 19);
        Human ruslan = new Human("Ruslan", 25);

        /*
        Human humans[] = new Human[4];
        humans[0] = marsel;
        humans[1] = alina;
        humans[2] = regina;
        humans[3] = ruslan;
        */

        Human humans[] = {alina, marsel, ruslan, regina};

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }

    }
}
