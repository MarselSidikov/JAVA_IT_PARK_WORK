package ru.itpark.inheritance;

public class Main {

    public static void main(String[] args) {
	    String names[] = new String[5];
	    int weightes[] = new int[5];

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
