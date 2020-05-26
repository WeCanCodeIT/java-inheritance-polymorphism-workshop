package zoo;

import zoo.animals.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the We Can Code IT Zoo!!!!");
        System.out.println("Where polymorphism comes to your console!");

        ArrayList<Animal> animals = new ArrayList<>();

        Bird phoenix = new Phoenix();
        Bird bird = new Bird("Jungle", "Very Hungry", "Pin Feather");
        Mammal mammal = new Mammal("City Park");
        Fish fish = new Fish();
        animals.add(phoenix);
        animals.add(bird);
        animals.add(mammal);
        animals.add(fish);
        for(Animal animal : animals){
            doStuff(animal);
            System.out.println("-------------");
        }
    }

    private static void doStuff(Animal animal) {
        System.out.println("This animal hunger is :" + animal.getHunger());
        animal.eat();
        animal.breathe();
        System.out.println("This animal has " + animal.getBoneType() +
                " bones.");
        System.out.println("This animal hunger is: " + animal.getHunger());
        System.out.println("This animal lives in a: " + animal.getHabitat());
        if (animal instanceof Bird) {
            System.out.println("This animal has this type of feathers: " + ((Bird) animal).getFeatherType());
        }
        if(animal instanceof Mammal){
            ((Mammal) animal).shed();
        }
        animal.die();
    }

}

