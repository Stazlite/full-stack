import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stram005 {
    public static void main(String[] args){
        List<Integer>list= Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().sorted().forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
        list.stream().skip(3).forEach(System.out::println);
        list.stream().limit(4).forEach(System.out::println);
        long l=list.stream().count();
        System.out.println(l);
    }
}

