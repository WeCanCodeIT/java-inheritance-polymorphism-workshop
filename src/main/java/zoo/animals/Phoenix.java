package zoo.animals;

public class Phoenix extends Bird {
    public Phoenix() {
        super("volcano", "Always hungry", "Red Feathers");
    }
    @Override
    public void die(){
        isAlive=true;
        System.out.println("Burst into flames, and then fly away.");
    }
}
