package week3.beehive;

public class Worker extends Bee{
    int capacity;
    int load;



    public Worker(int initialCapacity, int initialLoad){
        System.out.println("CONSTRUCTOR");
        capacity = initialCapacity;
        load = initialLoad;

    } // Constructor, heeft exact dezelfde naam als de functie zelf, geen return

    public Worker (int load) {
        this.load = load;
        this.capacity = 100;
    } // Ook constructor

    public Worker(){
        capacity = 10;
        load = 0;
    } // Ook constructor



    public void gatherNectar() { // Method

        for (int i =0; i<10 && capacity > load; i++) {
            System.out.println("Visit next flower");
            load +=5;
        }
    }

    public static void main(String[] args) {

        Worker maya = new Worker(12,13); // object
        maya.gatherNectar();

        Worker willy = new Worker(10); // object
        willy.gatherNectar();

        /*Worker[] workers = new Worker[500];
        for(int i=0; i < workers.length; i++){
            workers[i] : new Worker();*/
        }



    }

