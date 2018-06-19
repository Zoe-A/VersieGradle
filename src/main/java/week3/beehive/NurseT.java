package week3.beehive;

import java.util.Scanner;

public class NurseT extends Bee{
    int nectar;
    int patience;
    int honey;



    public NurseT(String inname, int innectar, int inpatience){
        super (inname);
        nectar = innectar;
        patience = inpatience;

    }

    public void makeHoney() {
        this.nectar -= 5;
        this.patience -= 2;
        honey += 3;
    }

    public void feedLarvae(LarvaeT toFeed) {
        this.honey -=  3;
        this.patience -= 1;
        toFeed.food += 2;


    }

    public void nurture() {
        this.patience -= 5;
    }

    public void play(){
        this.patience += 2;
    }

    public String printStatus(){
        String s = "Status " + getName() + "  | Nectar : " + this.nectar + " | Patience : " + this.patience + " | Honey : " + this.honey;
        return s;
    }


    public static void main(String[] args) {

        NurseT silly = new NurseT("Silly",30, 20);
        /*NurseT giggles = new NurseT(15, 5, "Giggles");*/
        System.out.println(silly.printStatus());

        LarvaeT junior = new LarvaeT(5, 5, "Junior");
        String statusLarvae = "Status " + junior.name + " | food : " + junior.food + " | mood : " + junior.mood + " | diaper : " +  junior.diaper;
        System.out.println(statusLarvae);

        System.out.println();

        Boolean larveaFainted = false;
        Scanner sc = new Scanner(System.in);

        while (!larveaFainted){
            System.out.println("1 : feed larvae, 2 : nurture larvae, 3 : play with larvae , any key : make honey ");

            int choice  = sc.nextInt();
            switch (choice) {
                case 1:
                    silly.feedLarvae(junior);
                    break;
                case 2:
                    silly.nurture();
                    break;
                case 3:
                    silly.play();
                    break;
                default:
                    silly.makeHoney();
                    break;
            }
            System.out.println(silly.printStatus());
            System.out.println(statusLarvae);
            System.out.println();

            junior.food -=1;
            statusLarvae = "Status " + junior.name + " | food : " + junior.food + " | mood : " + junior.mood + " | diaper : " +  junior.diaper;

            if (junior.food <= 0 || junior.mood <= 0 || junior.diaper >= 15 ){
                larveaFainted = true;
            }else{
                larveaFainted = false;
            }
        }

        System.out.println("OH NO LARVAE FAINTED");


    }






}
