package zoo.animals;

public class RiverRat extends Rodent implements Swimming{

    public RiverRat(String name) {
        super(name, "River", "Brown");
    }

    @Override
    public void swim() {
        System.out.println("I swim with my little paws on top of the water.");
    }
}
