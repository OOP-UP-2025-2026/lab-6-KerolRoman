package ua.opnu.list.animal;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    String makeSound() {
        return getName() + " каже: Гав!";
    }
}
