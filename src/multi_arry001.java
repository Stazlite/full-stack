public class multi_arry001  {
    public static void main(String[] args) {
        int[][] arra = {
                {0, 1, 3},
                {8, 6, 8},
                {5, 8, 9},
        };

        int j = 2; // Start column index from last column
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i][j] + " ");
            j--; // Decrease column index
        }
    }
}


