package app;

import java.util.Random;
import java.util.Arrays;
import static app.ArrayUtils.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("Оригінальний масив: " + Arrays.toString(array));

        mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        // Використати бінарний пошук для знаходження певного значення
        int target = array[rand.nextInt(array.length)]; // Випадкове значення з масиву
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Значення " + target + " знайдено на позиції: " + index);
        } else {
            System.out.println("Значення " + target + " не знайдено в масиві.");
        }
    }
}
