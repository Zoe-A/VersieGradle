public class HelloWorld {

    public static void main(String[] args) {

        String myName = "Lalalalalal";

        float dagloon = 100;
        double aantalDagen = 20;
        int aantalKind = 1;
        double perKind = 50;
        double treinAbbonement = 150;
        double loon;
        boolean bedrijfswagen = false;


            loon = dagloon * aantalDagen;
            if (bedrijfswagen == false) {
                loon = loon + treinAbbonement;
            }
            loon = loon + (aantalKind * perKind);



        System.out.println("Dag " + myName + " jouw loon bedraag " + loon + " euro.");


    }
}
