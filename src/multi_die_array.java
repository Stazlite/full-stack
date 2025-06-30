public class multi_die_array
{
 public static void main(String[] args)
 {
     int[][] arra= {
             {0,1,3},
             {8,6,8},
             {5,8,9},
         };
             for (int i=0;i<arra.length;i++){
             System.out.print(arra[i][i] +" ");
         }
                 for (int i=0;i<arra.length;i++)
             {
                 System.out.print(arra[i][arra.length-i-1] +" ");
             }
     }
 }