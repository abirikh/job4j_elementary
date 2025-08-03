package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {

        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }

        throw new ElementNotFoundException("Элемент '" + key + "' не найден в массиве");
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        String searchKey = "pear";

        try {
            int index = indexOf(fruits, searchKey);
            System.out.println("Индекс элемента: " + index);
        } catch (ElementNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}