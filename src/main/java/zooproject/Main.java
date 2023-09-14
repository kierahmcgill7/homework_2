package zooproject;

public class Main {
    public static void main(String[] args) {
        double dogWeight[] = {12, 12, 3, 100, 80};
        double catWeight[] = {12, 12, 3, 100, 80};
        double humanWeight[] = {12, 12, 3, 100, 190};

        Animal dog = new Animal("Dog", 300, dogWeight, "woof woof" );
        Animal cat = new Animal("Cat", 200, catWeight, "meow meow");
        Animal human = new Animal("Human", 70000000, humanWeight, "hi");

        dog.printAnimalSound();
        dog.printAnimalWeight();
        cat.printAnimalSound();
        cat.printAnimalWeight();
        human.printAnimalSound();
        human.printAnimalWeight();

    }
}
