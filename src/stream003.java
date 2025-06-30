import java.util.*;
import java.util.function.*;

public class stream003 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer i) {
                return i + 2;
            }
        };
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(f)
                .forEach(System.out::println);
    }
}