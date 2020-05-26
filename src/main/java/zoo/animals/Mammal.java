package zoo.animals;

public class Mammal extends Animal{
    public Mammal(String habitat) {
        super(habitat, "marrow", "Crying for food");
    }

    public void shed(){
        System.out.println("I shed fur.");
    }
    @Override
    public void eat(){
        hunger = "I'm full on fruits and nuts.";
        System.out.println("Eat's food with their mouth.");
    }
    @Override
    public void breathe(){
        System.out.println("I breathe through my mouth into my lungs.");
    }
    @Override
    public void die(){
        isAlive = false;
        System.out.println("Got too old.");
    }
}
