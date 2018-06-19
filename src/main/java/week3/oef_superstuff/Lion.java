package week3.oef_superstuff;

public class Lion extends Cat {
    private int power;

    public Lion(){}

    public Lion(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("ROAR");
    }

    public void rule(){
        System.out.println("I juuust can't wait to be king. Todododoto todudodu.");
    }

}
