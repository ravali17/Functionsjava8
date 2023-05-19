import java.util.function.Function;

public class IsEven {
    static void f1( Function<Integer,Boolean>fun){
        Boolean r=fun.apply(5);
        System.out.println(r);
    }


    public static void main(String[] args) {
        Function<Integer,Boolean>isEven=(x)->x%2==0;
        f1(isEven);
    }
}
