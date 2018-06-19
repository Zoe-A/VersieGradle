package week3.oef_superstuff;

public abstract class Animal {

    protected String name;


    public Animal() {
        name = "floofer";
    }

    public Animal(String name) {
        this.name = name;
    }


    public abstract void sound();



    public static void main(String[] args) {

        Cat cat1 = new Cat("pure evil");
        Cat cat2 = new Cat("victim");
        Bird bird1 = new Bird("suprise bomber");
        Dog dog1 = new Dog();
        Rabbit rabbit1 = new Rabbit("too fluffy for you");
        Lion lion1 = new Lion();


        Animal[] zoo = { cat1, bird1, dog1, rabbit1, lion1, };
        for (Animal beestje : zoo){
            System.out.println(beestje.name);
            beestje.sound();

        }

        System.out.println("---------------");

        cat1.scratch(cat2);
        bird1.fly();
        dog1.bite();
        lion1.rule();

        System.out.println("----------------");





    }


}
