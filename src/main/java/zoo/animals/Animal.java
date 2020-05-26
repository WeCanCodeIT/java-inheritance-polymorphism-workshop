package zoo.animals;

public abstract class Animal {

    private String habitat;
    private String boneType;
    protected boolean isAlive;
    protected String hunger;


    public Animal(String habitat, String boneType, String hunger){
        this.habitat = habitat;
        this.boneType = boneType;
        this.hunger = hunger;
        isAlive = true;
    }

    public void reproduce(){
        System.out.println("I make more of myself.");
    }

    public abstract void eat();


    public abstract void die();

    public void breathe(){
        System.out.println("I take oxygen into my body for respiration.");
    }

    public String getHabitat() {
        return habitat;
    }

    public String getBoneType() {
        return boneType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getHunger() {
        return hunger;
    }
}
