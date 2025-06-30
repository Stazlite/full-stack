import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;


public class stream002 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
       /*Predicate<Integer> pie= new Predicate<Integer>() {
            public boolean test(Integer i){
                return i%2==1;// odd numbers
            }
            };*/
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
    }
}
