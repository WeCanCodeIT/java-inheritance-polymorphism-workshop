package zoo.animals;

public abstract class Animal {

    private boolean isAlive;
    private String name;
    private String habitat;

    public Animal(String name, String habitat){
        this.name = name;
        this.habitat = habitat;
        isAlive = true;
    }
    public abstract void breathe();

    public void die(){
        isAlive = false;
        System.out.println("This animal has died.");
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }
}
