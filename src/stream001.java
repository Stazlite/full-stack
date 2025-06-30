import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class stream001 {
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        Stream s1=list.stream();
        s1.forEach(System.out::println);//instead of using i->System.out.println(i)
        s1.forEach(System.out::println);//stream is onetime use

    }
}
