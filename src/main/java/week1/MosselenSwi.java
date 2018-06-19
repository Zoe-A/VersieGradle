public class MosselenSwi {
    public static void main(String[] args) {
        int maand = 6;

        switch (maand) {

            case 9:
                System.out.println("te klein");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Super!");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("einde seizoen");
                break;
            default:
                System.out.println("NEE");

        }

    }
}
