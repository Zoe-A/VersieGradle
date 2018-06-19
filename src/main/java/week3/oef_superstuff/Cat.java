package week3.oef_superstuff;

public class Cat extends Animal {

    protected int lives = 9;


    public Cat() {

    }

    public Cat(String name) {
        super(name);

    }
    @Override
    public void sound(){
        System.out.println("Miauw!");
    }

    public void scratch(Cat enemy){
        enemy.lives = enemy.lives-1;
        System.out.println("Auw! " + enemy.name + " lives : " + enemy.lives);

    }

}
