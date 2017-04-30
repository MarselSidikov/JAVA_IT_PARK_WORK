package ru.itpark;

public class HashMap<K, V> {
    private final int TABLE_SIZE = 4;
    private Node<K,V> table[];

    public HashMap() {
        this.table = new Node[TABLE_SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode();
        int indexOfKey = hash & (TABLE_SIZE - 1);

        Entry<K,V> entry = new Entry<>(key, value, hash);
        Node<K,V> nodeOfEntry = new Node<>(entry);

       if (table[indexOfKey] != null) {
           // получили первый узел
           Node<K, V> current = table[indexOfKey];
           // пока есть следующий
           while (current.getNext() != null) {
               // сравниваем хеш
               if (current.getEntry().getHash() == hash) {
                   // если хеш совпал, значит, это возможно тот же ключ
                   if (current.getEntry().getKey().equals(key)) {
                       // если это точно, тот же ключ, значит надо замени
                       current.getEntry().setValue(value);
                       return;
                   }
               }
               current = current.getNext();
           }

           if (current.getEntry().getHash() == hash) {
               // если хеш совпал, значит, это возможно тот же ключ
               if (current.getEntry().getKey().equals(key)) {
                   // если это точно, тот же ключ, значит надо замени
                   current.getEntry().setValue(value);
                   return;
               }
           }

           current.setNext(nodeOfEntry);
       } else {
           table[indexOfKey] = nodeOfEntry;
       }
    }

}
