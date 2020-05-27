package zoo.animals;

public abstract class Fish extends Animal implements Swimming{
    String waterType;

    public Fish(String name, String habitat, String waterType){
        super(name, habitat);
        this.waterType = waterType;
    }

    @Override
    public void swim(){
        System.out.println("Use their fins to move through water.");
    }
    @Override
    public void breathe() {
        System.out.println("I breathe through my gills to take in oxygen.");
    }

    public String getWaterType() {
        return waterType;
    }
}
