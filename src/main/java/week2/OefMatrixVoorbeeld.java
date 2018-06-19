package week2;

public class OefMatrixVoorbeeld {
    
        public static void main(String[] args) {
            int[][] a = {
                    {1, 2, 0},
                    {2, 3, 4},
            };

            int[][] b = {
                    {1, 2},
                    {3, 2},
                    {1, 4},
            };

            System.out.println("A =");
            print(a);
            System.out.println("-----");

            System.out.println("B =");
            print(b);
            System.out.println("-----");

            System.out.println("A x B =");
            int[][] c = mul(a, b);
            if(c == null) {
                System.out.println("Niet vermenigvuldigbaar >_<");
            } else {
                print(c);
            }
        }

        /**
         * Print een matrix op het scherm.
         */
        public static void print(int[][] matrix) {
            for (int[] row : matrix) {
                for (int cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }

        /**
         * Voert vermenigvuldiging uit van [a] en [b]
         * @return resultaat matrix of null als niet vermenigvuldigbaar.
         */
        public static int[][] mul(int[][] a, int[][] b) {
            int[][] p = bereidOutputMatrixVoorIndienMogelijk(a, b);
            if(p == null) {
                return null;
            }

            for(int i=0; i < a.length; i++) {
                for(int j = 0; j < b[0].length; j++) {
                    int sum = 0;
                    for(int k = 0; k < a[0].length; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    p[i][j] = sum;
                }
            }

            return p;
        }

        /**
         * Bepaalt of [a] en [b] vermenigvuldigbaar zijn en maakt de vereiste output matrix, of geeft null terug als het niet mogelijk is.
         */
        public static int[][] bereidOutputMatrixVoorIndienMogelijk(int[][] a, int[][] b) {
            if(a[0].length == b.length) {
                return new int[a.length][b[0].length];
            } else {
                return null;
            }
        }
    }