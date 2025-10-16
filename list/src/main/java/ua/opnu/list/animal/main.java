package ua.opnu.list.animal;

public class main {
    public static void main(String[] args) {

        Animal dog = new Dog("Топік");
        Animal cat = new Cat("Котя");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}