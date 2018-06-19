package week3.beehive;

import java.util.Scanner;

public class Soldier extends Bee {
    int hitpoint;
    int strenght;
    int armour;

    public Soldier(int inhitpoint, int instrenght, int inarmour, String name){
        super(name);
        hitpoint = inhitpoint;
        strenght = instrenght;
        armour = inarmour;
    }

    public void attack(Soldier enemy){

        enemy.hitpoint -= (this.strenght * 1.5) - enemy.armour;
        this.hitpoint -= (enemy.strenght * 0.5) - this.armour;
    }

    public void heal (){
        this.hitpoint = this.hitpoint*2;
    }


    public boolean isDead(){
        return (hitpoint <= 0);
    }


    public static String printResults(Soldier A, Soldier B){ // Waarom moet ik hier static toevoegen om resultMain te kunnen printen?
        String result;

        if (A.isDead() || B.isDead()){
            result = "WE HAVE A WINNER";
        } else {
            result ="DRAW";
        }

        return result;
    }

    public static String printStatus(Soldier A, Soldier B){
        String status;
           status = A.getName() + " hitpoints : " + A.hitpoint + " "+ B.getName() + " hitpoints : " + B.hitpoint;

        return status;
    }

    public static String checkAnswer(String choice){
        while (!choice.equalsIgnoreCase("Attack") && !choice.equalsIgnoreCase("Heal")){
            System.out.println("Please enter a valid option. Attack or Heal.");
            Scanner sc = new Scanner(System.in);
            choice = sc.next();
        }
        return choice;
    }

    public static void main(String[] args) {

        Soldier sylvester = new Soldier(10, 5, 2, "Sylvester");
        Soldier arnold = new Soldier(10, 5, 2, "Arnold");

        while (arnold.hitpoint > 0 && sylvester.hitpoint > 0) {

            System.out.println("What does Sylvester do? Choose Attack or Heal.");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            answer = checkAnswer(answer);
            if (answer.equalsIgnoreCase("Attack")) {
                sylvester.attack(arnold);
                System.out.println(printStatus(arnold, sylvester));
            } else {
                sylvester.heal();
                System.out.println(printStatus(arnold, sylvester));
            }

            System.out.println();

            System.out.println("How does Arnold respond? Choose Attack or Heal.");
            sc = new Scanner(System.in);
            answer = sc.next();
            answer = checkAnswer(answer);
            if (answer.equalsIgnoreCase("Attack")) {
                arnold.attack(sylvester);
                System.out.println(printStatus(arnold, sylvester));
            } else {
                arnold.heal();
                System.out.println(printStatus(arnold, sylvester));
            }

            System.out.println();
        }


        String resultMain = printResults(arnold, sylvester);
        System.out.println(resultMain);









    }


}
