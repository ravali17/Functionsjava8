import java.util.function.BiFunction;

public class FuctionBi {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>add=(x,y)->x+y;
        f1(add);
    }
    static void f1( BiFunction<Integer,Integer,Integer>funadd){
        int r= funadd.apply(5,3);
        System.out.println(r);
    }
}
