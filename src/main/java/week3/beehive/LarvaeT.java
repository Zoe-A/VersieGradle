package week3.beehive;

public class LarvaeT {
    int food;
    int diaper;
    int mood;
    String name;

    public LarvaeT(int infood, int inmood, String inname) {
    food = infood;
    mood = inmood;
    name = inname;
    }

    public Boolean larvaeFainted () {
        Boolean s;
        if (this.food <= 0 || this.mood <= 0 || this.diaper >= 15) {
            s = true;
            System.out.println(s);
        } else {
            s = false;
            System.out.println(s);
        }
        return s;
    }
}
