package zoo.animals;

public class GoldFish extends Fish{

    public GoldFish(String name) {
        super(name, "Fish Tank", "Fresh Water");
    }
    @Override
    public void swim(){
        System.out.println("Swim with tiny fins.");
    }

}
