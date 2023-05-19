import java.util.function.Function;

public class FunctionPrograms {
    public static void main(String[] args) {
        Function<Integer,Integer>mul=(x)->x*x;
f1(mul);
//int r1=mul.apply(7);
    }
    static void f1(Function<Integer, Integer> fun){
        int r=fun.apply(3);
        System.out.println(r);

    }
}
