package lesson;

public class OperationsAndConditions {
    public void print() {

        int x = 10;
        int y = 30;

        if (x > y) {
            System.out.println("30 больше 10");
            int a = 10 + 10;
            int b = 0;
            System.out.println(a + ++b);
            System.out.println(x + " > " + y);
        }

        if (x < y) {
            System.out.println(x + " меньше " + y);
        }

        int time = 16;

        if (time < 10) {
            System.out.println("Доброе утро!");
        } else if (time < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        String result = time < 12 ? "Доброе утро" : "Добрый день";
        System.out.println("Результат операции: " + result);

        double salary = 100000;
        char grade = 'A';

        switch (grade) {
            case 'A' -> salary *= 1.5;
            case 'B' -> salary = salary * 1.25;
        }
        System.out.println(salary);

        switch (grade) {
            case 'A' -> System.out.println(salary * 1.5);
            case 'B' -> System.out.println(salary * 1.25);
            default -> System.out.println(salary);
        }

        if (grade == 'A') {

        } else if (grade == 'B') {

        } else {

        }

        int grade1 = 1000;
        if (grade1 >= 0 && grade1 < 50) {
            System.out.println("C");
        } else if (grade1 >= 50 && grade1 < 75) {
            System.out.println("B");
        } else if (grade1 >= 75 && grade1 <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Неверное значение оценки");
        }

        int day = 10;
        switch (day) {
            case 1 -> {
                System.out.println("Понедельник");
                System.out.println("Пора работать!");
            }
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Неверное значение");
        }

        char letter = 'A';
        switch (letter) {
            case 'A' -> System.out.println("A");
        }

        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int i2 = 34;

        do {
            System.out.println(i2);
            i2++;
            System.out.println("Нажмите А - отобразить инфо");
            System.out.println("Нажмите E - выйти");
        } while (i2 < 478);


        for (int i3 = 0; i3 < 10; i3++) {
            if (i3 % 2 == 0) {
                System.out.println(i3 + ": четное");
            } else if (i3 % 2 == 1) {
                System.out.println(i3 + ": нечетное");
            }
        }

        // Пример println() и print()
        System.out.println("Привет мир!" + "Я учу Java");
        System.out.print("print без перехода. ");
        System.out.print("Пример. ");

        // Это однострочный коммент
        /*
           Многострочный коммент
         */

        byte a = 127;
        short s = 23;
        int b = 0;
        long h = 100000L;
        System.out.println(h);

        float f1 = 234.5f;
        double d1 = 2.4;
        float e = 12e3f;

        float f2 = (float) 2.5;

        System.out.println(f1);
        System.out.println(e);

        char letterA = 'A', letterB = 66, letterC = 67;

        System.out.println(letterA + letterB + letterC);
        System.out.println(letterA + " " + letterB + " " + letterC);

        boolean true1 = true;
        System.out.println(true1);
        boolean false1 = false;
        System.out.println(true1);
        System.out.println(false1);

        String helloWorld = null;
        System.out.println(helloWorld);

        final String name = "Maria";
        String surname = " Smith";

        String fullName = name + surname;
        System.out.println(fullName);

        System.out.println("Привет, " + name);

        int firstNumber = 100;
        System.out.println("До изменения: " + firstNumber);
        firstNumber = 200;
        System.out.println("После изменения: " + firstNumber);

        int secondNumber;
        secondNumber = 200;
        System.out.println("Второе число: " + secondNumber);
    }
}
