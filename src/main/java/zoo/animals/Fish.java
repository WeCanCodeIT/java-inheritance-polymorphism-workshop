package zoo.animals;

public abstract class Fish extends Animal{
    String waterType;
    public Fish(String name, String habitat, String waterType){
        super(name, habitat);
        this.waterType = waterType;
    }

    @Override
    public void breathe() {
        System.out.println("I breathe through my gills to take in oxygen.");
    }

    public String getWaterType() {
        return waterType;
    }
}
