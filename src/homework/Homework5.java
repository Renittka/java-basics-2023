package homework;

public class Homework5 {
    public void print() {
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
    }
}
