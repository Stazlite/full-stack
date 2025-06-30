import java.util.Scanner;
import java.util.Scanner;
public class multi_transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int mat_trans[][] = new int[col][row];
        System.out.println("enter the elements of first matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                mat_trans[j][i]=a[i][j];
            }
        }
        System.out.println("the transpose of matrix is");
        for (int i=0;i<mat_trans.length;i++){
            for(int j=0;j<mat_trans.length;j++){
                System.out.print(mat_trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
