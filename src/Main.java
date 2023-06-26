import example.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        System.out.println(myAnimal);
        myAnimal.setName("Кот");
        myAnimal.setColor("Серый");
        myAnimal.setWeight(2.5);
        System.out.println(myAnimal);
        myAnimal.run();
        myAnimal.run(20);

        Animal myAnimal2 = new Animal();
        System.out.println(myAnimal2);

        System.out.printf("Имя: %s, цвет: %s, вес: %.1f",  myAnimal2.getName(), myAnimal2.getColor(), myAnimal2.getWeight());

        Animal myAnimal3 = new Animal("Лиса", "Рыжий", 3);
        myAnimal3.run(2);
        Scanner scanner = new Scanner(System.in);
        //Date date = new Date();
    }

    public static void doSomethingStatic() {
        System.out.println("Static method");
    }

    public void doSomethingPublic() {
        System.out.println("Non static method");
    }
}