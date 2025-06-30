public class intimat {
    public static void main(String[] args){
        Object[][] arr = {
                {"t", 8, 8},
                {1, "u", 6},
                {7, 8, "y"}
        };
        for (Object[] row : arr) {
            for (Object elem: row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}