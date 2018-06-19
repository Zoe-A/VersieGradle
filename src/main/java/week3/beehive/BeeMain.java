package week3.beehive;

public class BeeMain {
    public static void main(String[] args) {
        Bee maya = new Bee ("Maya");
        maya.fly();

        Worker test1 = new Worker();
        test1.fly();

        NurseT test2 = new NurseT("test2", 5, 10);
        test2.fly();

        Soldier test3 = new Soldier(10, 5, 2, "test3");
        test3.fly();
    }
}
