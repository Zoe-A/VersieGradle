package week3.beehive;

public class Bee {

    private String name;


    public Bee() {}

    public Bee(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println(this.name + ", fly you fool!");

    }

    public static void main(String[] args) {
        Bee lady = new Bee("Lady");
        lady.fly();
    }


}
