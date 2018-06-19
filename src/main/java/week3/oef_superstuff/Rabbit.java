package week3.oef_superstuff;

public class Rabbit extends Animal {
    private Boolean fluffines;

    public Rabbit(){}

    public Rabbit(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("....");
    }


}
