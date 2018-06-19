package week5;

import static java.lang.Math.abs;

public class Breuk {
    private int teller;
    public int getTeller() {
        return teller;
    }
    private int noemer;
    public int getNoemer() {
        return noemer;
    }



    public Breuk(int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }


    private static int greatestCommonFactor(int a, int b) {
        if(a == 0 || b == 0) {
            return 1;
        }

        a = abs(a);
        b = abs(b);
        if(a < b) {
            return greatestCommonFactor(b, a);
        }

        int delta = a % b;
        if(delta == 0) {
            return b;
        } else {
            return greatestCommonFactor(b, delta);
        }
    }

    public void vereenvoudig(){
        int gemDeler = greatestCommonFactor(this.teller, this.noemer);
        this.teller = this.teller / gemDeler;
        this.noemer = this.noemer / gemDeler;

    }

    public void plus(Breuk that){
        this.teller = (this.teller * that.noemer) + (this.noemer * that.teller);
        this.noemer = this.noemer * that.noemer;
        this.vereenvoudig();


    }

    public void min(Breuk that){
        this.teller = (this.teller * that.noemer) - (this.noemer * that.teller);
        this.noemer = this.noemer * that.noemer;
        this.vereenvoudig();


    }

    public void maal(Breuk that){
    this.teller = this.teller * that.teller;
    this.noemer = this.noemer * that.noemer;
    this.vereenvoudig();

    }

    public void delen(Breuk that){
        int nieuweTeller = this.noemer;
        int nieuweNoemer = this.teller;

        if (this.noemer == 0 || that.getNoemer() == 0){
            throw new IllegalArgumentException("DA MAG NI");
        }

        this.teller = that.teller * nieuweTeller;
        this.noemer = that.noemer * nieuweNoemer;
        this.vereenvoudig();

    }
}
