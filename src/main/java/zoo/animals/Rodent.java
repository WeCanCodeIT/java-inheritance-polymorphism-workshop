package zoo.animals;

public abstract class Rodent extends Animal {
    private String color;
    int foodStashLevel;

    public Rodent(String name, String habitat, String color){
        super(name, habitat);
        this.color = color;
        foodStashLevel = 0;
    }

    @Override
    public void breathe() {
        System.out.println("I breathe into my lungs to take in oxygen.");
    }

    public void gatherFood(){
        foodStashLevel++;
    }

    public String getColor() {
        return color;
    }

    public int getFoodStashLevel() {
        return foodStashLevel;
    }

}
