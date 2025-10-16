package ua.opnu.list.animal;

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    String makeSound() {
        return getName() + " каже: Мяу!";
    }
}