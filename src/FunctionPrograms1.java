import java.util.function.Function;

public class FunctionPrograms1 {
    public static void main(String[] args) {
        Function<Integer,Integer>mul=(x)->x*x;
        Function<String,String>toupper=(x)->x.toUpperCase();
        f1(mul,toupper);
    }
    static void f1( Function<Integer,Integer>fun,Function<String,String>toupperfun){
        String s1=toupperfun.apply("ravi");
        System.out.println(s1);
        int r=fun.apply(5);
        System.out.println(r);
    }
}
