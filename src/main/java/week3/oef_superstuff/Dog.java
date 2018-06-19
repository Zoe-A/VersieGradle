package week3.oef_superstuff;

public class Dog extends Animal {
    private String[] tricks ;

    public Dog () {
    }

    public Dog(String name){
        this.name = name;
    }


    @Override
    public void sound(){
        System.out.println("Woof!");
    }

    public void bite(){
        System.out.println("nom nom nom nom");
    }


}
