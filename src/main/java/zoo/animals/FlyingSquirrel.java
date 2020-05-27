package zoo.animals;

public class FlyingSquirrel extends Rodent implements Flying {
    public FlyingSquirrel(String name) {
        super(name, "woods", "gray");
    }

    @Override
    public void takeOff() {
        System.out.println("Jump from tree.");
    }

    @Override
    public void soar() {
        System.out.println();

    }

    @Override
    public void land() {

    }
}
