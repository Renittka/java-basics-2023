package example;

public class Animal {
    private String name;
    private String color;
    private double weight;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world");
        }
    }

    public Animal() {
        name = "Кот";
        color = "Рыжий";
        weight = 3;
    }

    public Animal(String name) {
        this.name = name;
        color = "";
        weight = 0;
    }

    public Animal(String name, String color) {
        this(name);
        this.color = color;
    }

    public Animal(String name, String color, double weight) {
        this(name, color);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.name + " бежит");
    }

    public void run(int speed) {
        System.out.println(this.name + " бежит со скоростью: " + speed);
    }

    @Override
    public String toString() {
        //return "Имя: " + name + ", цвет: " + color + ", вес: " + weight;

        return String.format("Имя: %s, цвет: %s, вес: %.1f", name, color, weight);
    }

}
