package ru.itpark;

/**
 * Created by Student21 on 08.04.2017.
 */
public class Task9 {
    /**
     * Проверяет, является ли символ цифрой
     * @param c символ
     * @return true, если c = '0','1','2'
     */
    public boolean isDigit(char c) {
        return c <= '9' && c >= '0';
    }

    /**
     * Если на вход пришло '9', то функция возвращает
     * число 9 в int
     * @param c
     * @return
     */
    public int intFromChar(char c) {
        return c - '0';
    }
}
