package week2;


public class RandomNumber {
    public static void main(String[] args) {
        int max = 10;
        int min = 5;
        int r = min + (int) (Math.random() * (max - min));
        System.out.println(r);
    }
    public static int berekenRandomGetal (int min, int max){
        int randy = min + (int) (Math.random() * (max - min));
        return randy;
    }
}
