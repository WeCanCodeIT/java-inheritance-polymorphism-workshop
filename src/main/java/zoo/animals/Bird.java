package zoo.animals;

import zoo.animals.Animal;

public class Bird extends Animal {

    String featherType;

    public Bird(String habitat, String hunger, String featherType) {
        super(habitat, "hollow", hunger);
        this.featherType = featherType;
    }

    public void layEggs(){
        System.out.println("We laid an egg.");
    }

    @Override
    public void eat(){
        hunger = "I'm full.";
        System.out.println("I peck at food with my beak.");
    }
    @Override
    public void breathe(){
        System.out.println("I breathe through my beak.");
    }

    public String getFeatherType() {
        return featherType;
    }

    @Override
    public void die(){
        isAlive = false;
        System.out.println("Flew into skyscraper.");
    }
}
