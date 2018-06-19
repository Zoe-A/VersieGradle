package week4;

public enum Months {
    JANUARI (6, 10),
    FEBRUARI(8, 9),
    MAART(8,9),
    APRIL(7,8),
    MEI(5,5),
    JUNI(5,6),
    JULI(5,6),
    AUGUSTUS(7,8),
    SEPTEMBER(9,6),
    OKTOBER(8,8),
    NOVEMBER(1,2),
    DECEMBER(2,5);

    private int gemRegen;
    private int gemZon;

    Months(int gemRegen, int gemZon) {
        this.gemRegen = gemRegen;
        this.gemZon = gemZon;
    }

    public int getGemRegen() {
        return gemRegen;
    }

    public int getGemZon() {
        return gemZon;
    }
}
