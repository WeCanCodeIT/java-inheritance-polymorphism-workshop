package zoo.animals;

public class Fish extends Animal{
    public Fish() {
        super("Water", "hollow", "Looking for food");
    }

    public void swim(){
        System.out.println("I move by swimming in water with my fins.");
    }
    @Override
    public void breathe() {
        super.breathe();
        System.out.println("I pass water through my gills to do that.");
    }

    @Override
    public void eat(){
        System.out.println("I find food floating by me.");
    }

    @Override
    public void die() {
        isAlive=false;
        System.out.println("I am no longer alive.");
    }
}
