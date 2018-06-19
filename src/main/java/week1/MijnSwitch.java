public class MijnSwitch {
    public static void main(String[] args) {
        int maand = 2;

        switch (maand) {
            case 1 :
                System.out.println("januari");
                break;
            case 2 :
                System.out.println("februari");
                break;
            default :
                System.out.println("ongeldige waarde");
        }
    }
}
