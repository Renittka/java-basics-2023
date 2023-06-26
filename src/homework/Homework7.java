package homework;

import example.Animal;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {

        printAnimal();

        String str = getString();
        System.out.println(str);

        printBookInfo();

        System.out.println(getSum(2, 4));

        double sum = getSum(2.5, 2.5);

        System.out.println(sum);

        System.out.println(getMinNumber(2, 5, 10));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        System.out.println("Введите z");
        int z = scanner.nextInt();

        System.out.println(getMinNumber(x, y, z));

        System.out.println(getAverage(25, 45, 65));
        System.out.println(getVowelsCount("DARTech"));

        System.out.println(getWordsCount("Java is good to learn Object Oriented programming."));

    }

    public static void printAnimal() {
        Animal myAnimal = new Animal();
        System.out.println(myAnimal.getName());

        Animal myAnimal2 = new Animal();
        myAnimal2.setName("Cat 2");

        System.out.println("Name example.Animal: " + myAnimal.getName());
        System.out.println("Name Animal2: " + myAnimal2.getName());
    }

    public static int getMinNumber(int x, int y, int z) {
        int tempMin = Math.min(x, y);
        return Math.min(tempMin, z);
    }

    public static double getAverage(int x, int y, int z) {
        return (double) (x + y + z) / 3;
    }

    public static int getVowelsCount(String input) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char c = input.toLowerCase().charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int getWordsCount(String input) {

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static double getPentagonArea(double sideLength) {

        double numerator = 5 * Math.pow(sideLength, 2);
        double denominator = 4 * Math.tan(Math.PI / 5);

        return numerator / denominator;

    }

    public static int getSumOfDigits(int value) {
        int sum = 0;

        // 121
        while (value != 0) {
            int digit = value % 10;
            sum += digit;
            value /= 10;
        }

        return sum;
    }

    public static boolean checkAllVowels(String input) {

        String vowels = "aeiou";
        String lowerCaseInput = input.toLowerCase();
        // AeeeAAAEEEiii

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char c = lowerCaseInput.charAt(i);

            if (vowels.indexOf(c) == -1) {

                System.out.println(i + "" + vowels.indexOf(c));
                return false;
            }
        }

        return true;
    }

    public static int getCountOfSpecificNumber(Integer value, char specificNumber) {
        int count = 0;

        String strValue = value.toString();

        for (int i = 0; i < strValue.length(); i++) {
            if (strValue.charAt(i) == specificNumber) {
                count++;
            }
        }

        return count;
    }

    public static int getCountOfSpecificNumber(int value, int specificNumber) {
        int count = 0;

        // 121
        while (value != 0) {
            int digit = value % 10;
            if (digit == specificNumber) {
                count++;
            }
            value /= 10;
        }

        return count;
    }

    public static String getString() {

        System.out.println("Выполняется метод  getString()");

        return "Hello world";
    }

    public static void printBookInfo() {

        System.out.println("Book info");
        System.out.println(getCount(10));
    }

    public static int getCount(int difference) {
        int count = 10;
        return count + difference;
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static double getSum(double x, double y) {
        return x + y;
    }

    public static double getSum(double x) {
        return x + x;
    }

    public static double getSum(float x, float y) {
        return x + y;
    }
}
