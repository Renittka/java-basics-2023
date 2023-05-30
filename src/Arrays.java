public class Arrays {
    public void print() {
        String[] fruits = {"Apple", "Banana", "Avocado", "Orange"};
        int[] myIntegers = {10, 20, 30, 40, 50};

        String[] myFruits = new String[4];
        for (int i = 0; i < myFruits.length; i++) {
            myFruits[i] = "Apple";
        }

        for (int integer : myIntegers) {
            System.out.println(integer);
        }

        for (String fruit : myFruits) {
            System.out.println(fruit);
        }

        for (int i = 1; i < fruits.length; i += 2) {
            fruits[i] = "Lime";
        }

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

    }
}
