package homework;

public class Homework6 {
    public void print() {
        // 6.1
        int[] array = {1, 3, 4, 1, 5, 5};
        int sumForAverage = 0;

        for (int number : array) {
            sumForAverage += number;
        }

        double average = (double) sumForAverage / array.length;
        System.out.println(average);

        // 6.2
        int[] array1 = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    System.out.println(array1[i]);
                }
            }
        }

        // 6.3
        int[] array2 = {1, 3, -6, 23, 14, 2};
        int x = 0;
        boolean isFound = false;
        for (int number : array2) {
            if (number == x) {
                isFound = true;
                break;
            }
        }
        System.out.println("Найдено: " + isFound);

        // 6.4
        int[] array3 = {1, 3, -6, 23, 14, 2};
        int x1 = 23;
        int foundIndex = 0;
        boolean isFoundX = false;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == x1) {
                foundIndex = i;
                isFoundX = true;
                break;
            }
        }
        if (isFoundX) {
            System.out.println("Найден индекс: " + foundIndex);
        } else {
            System.out.println("Не найдено");
        }


        // 6.5
        int[] array4 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int p = 2;
        int s = 6;
        int[] resultArray = new int[s - p + 1];
        int counter = 0;

        for (int i = p; i <= s; i++) {
            resultArray[counter] = array4[i];
            counter++;
        }

        for (int number : resultArray) {
            System.out.print(number + " ");
        }
    }
}
