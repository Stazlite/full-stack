import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class stream004 {
    public static void main(String[] args ){
        List<Integer>List= Arrays.asList(1,2,3,4,5,6);
        BinaryOperator<Integer>b=new BinaryOperator<Integer>() {
            public Integer apply(Integer i, Integer j) {
                return i+j;
            }
        };
        Integer sum = List.stream()
        .filter(i->i%2==0)
        .map(i ->i*2)
        .reduce(0,b);
        System.out.println(sum);
    }
}
