public class Main {
    public static void main(String[] args) {
        // 5.1
        int width = 5;
        int length = 5;
        boolean isSquare = false;

        if (width == length) {
            isSquare = true;
        }

        System.out.println("Результат: " + isSquare);

        // 5.2
        double price = 3000;
        if (price >= 5000) {
            price *= 0.9;
            // price = price * 0.9;
        }
        System.out.println(price);

        // 5.3
        int grade = 1000;
        char result = 0;
        if (grade >= 0 && grade <= 25) {
            result = 'F';
        } else if (grade > 25 && grade <= 45) {
            result = 'E';
        } else if (grade > 45 && grade <= 50) {
            result = 'D';
        } else if (grade > 50 && grade <= 60) {
            result = 'C';
        } else if (grade > 60 && grade <= 80) {
            result = 'B';
        } else if (grade > 80 && grade <= 100) {
            result = 'A';
        } else {
            System.out.println("Неправильная оценка");
        }
        if (result != 0) {
            System.out.println(result);
        }

        // 5.4
        String str = "123456";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }


        // 5.5
        int a = 7;
        boolean isPrime = true;

        if (a % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(a + " простое число? " + isPrime);


        // 5.6
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int z = 5;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 5.7
        int k = 10;
        int l = 15;
        int sum = 0;
        for (int i = k; i <= l; i++) {
            sum += i;
        }
        System.out.println(sum);


        // 5.8
        double salary = 100000;
        char attestationGrade = 'A';

        switch (attestationGrade) {
            case 'A' -> salary *= 1.5;
            case 'B' -> salary *= 1.25;
        }
        System.out.println(salary);

        // 5.9
        int n = 7;
        int n0 = 0;
        int n1 = 1;
        int n2;

        System.out.print(n0 + " " + n1 + " ");
        for (int i = 2; i < n; i++) {
            n2 = n1 + n0;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();

        int[] intArray = new int[n];
        intArray[0] = 0;
        intArray[1] = 1;
        for (int i = 2; i < intArray.length; i++) {
            intArray[i] = intArray[i - 1] + intArray[i - 2];
        }
        for (int number : intArray) {
            System.out.print(number + " ");
        }

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