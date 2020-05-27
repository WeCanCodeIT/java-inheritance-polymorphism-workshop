package zoo.animals;

public class FlyingFish extends Fish implements Flying{
    public FlyingFish(String name) {
        super(name, "Sea", "Salt Water");
    }

    @Override
    public void takeOff() {
        System.out.println("Jump out of water.");
    }

    @Override
    public void soar() {
        System.out.println("Glide in the air with fins.");
    }

    @Override
    public void land() {
        System.out.println("Splash back into water.");
    }
}
