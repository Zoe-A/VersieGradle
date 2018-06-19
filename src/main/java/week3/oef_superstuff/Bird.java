package week3.oef_superstuff;

public class Bird extends Animal {

    public Bird () {

    }

    public  Bird (String name) {
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Tirp!");
    }

    public void fly(){
        System.out.println("Let's go fly a kite.");
    }

}
