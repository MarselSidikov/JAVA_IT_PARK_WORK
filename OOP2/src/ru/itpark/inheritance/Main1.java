package ru.itpark.inheritance;

/**
 * Сортировка животных с именами по весу
 * Проблемы данного решения:
 * 1) А что, если захотим добавить еще один параметр,
 * например возраст и сортировать по возрасту? решение - еще один массив
 * и еще одна сортировка - не красиво и не функционально
 * 2) А что, если мы будем подавать неккоректные данные?
 * например вес - отрицательное число
 * 3) Нет единой сущности - используется два массива
 * ГЛАВНОЕ РЕШЕНИЕ - ввести классы
 */
public class Main1 {

    public static void main(String[] args) {
    	// массив имен животных
	    String names[] = new String[5];
	    // массив весов животных
	    int weightes[] = new int[5];
	    // таким образом, names[i] и weightes[i] - это имя
		// и весы i-го животного

	    names[0] = "Koala"; weightes[0] = 3;
	    names[1] = "Tiger"; weightes[1] = 2;
	    names[2] = "Bear"; weightes[2] = 10;
	    names[3] = "Bird"; weightes[3] = 1;
	    names[4] = "Mouse"; weightes[4] = 0;

	    for (int i = weightes.length - 1; i >= 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (weightes[j] > weightes[j+1]) {
	                int temp = weightes[j];
	                weightes[j] = weightes[j+1];
	                weightes[j+1] = temp;

	                String tempName = names[j];
	                names[j] = names[j+1];
	                names[j+1] = tempName;
                }
            }
        }

	    for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + weightes[i]);
        }

    }
}
