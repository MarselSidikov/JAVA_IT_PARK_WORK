package ru.itpark;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MainHash {

    public static void main(String[] args) {
	    Entry<String, String> array[] = new Entry[16];

	    // хеш-код строки Marsel
	    int hashCode = "Marsel".hashCode();
        System.out.println(hashCode);
        // hashcode = -1997431204
        // hashcode(2) = 10001000111100011001111001011100

        int arraySize = array.length; // 11

        int index = hashCode & (arraySize - 1); // 10 - 1010
        System.out.println(index); // 1000
        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());
    }
}
