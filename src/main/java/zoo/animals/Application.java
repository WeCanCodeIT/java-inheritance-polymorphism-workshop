package zoo.animals;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Fish goldie = new GoldFish("Goldie");
        Rodent riverRat = new RiverRat("Bob");
        Rodent squirrel = new GraySquirrel("Steve");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(goldie);
        animals.add(riverRat);
        animals.add(squirrel);

        for(Animal swimmingAnimal : animals){
            if(swimmingAnimal instanceof Swimming){
                ((Swimming) swimmingAnimal).swim();
            }
        }


    }



}
