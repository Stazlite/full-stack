import java.util.Scanner;
public class adding_two_mat {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of matrix");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int a[][]=new int[row][col];
       int b[][]=new int[row][col];
       int mat_add[][]=new int[row][col];
       System.out.println("enter the elements of first matrix");
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               a[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter the elements of second matrix");
           for(int i=0;i<b.length;i++){
               for(int j=0;j<b.length;j++){
                   b[i][j]=sc.nextInt();
               }
       }
           System.out.println("the sum of two matrix is");
           for(int i=0;i<mat_add.length;i++){
               for(int j=0;j<mat_add.length;j++){
                   mat_add[i][j]=a[i][j]+b[i][j];
                   System.out.print(mat_add[i][j] + " ");
               }
               System.out.println();

           }
    }
}
