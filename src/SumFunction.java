import java.util.function.Function;

public class SumFunction {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 5};
        Integer r1 = sum(arr, (x) -> x);
        System.out.println(r1);
        Function<Integer, Integer> f2 = x -> {
            if (x % 2 == 0) {
                return x;
            }
            return 0;
        };
        Integer r2 = sum(arr, f2);
        System.out.println(r2);
    }


 public    static int sum(int arr[], Function<Integer, Integer>fun){
        int sum=0;
     for (int i = 0; i <arr.length ; i++) {
         sum=sum+fun.apply(arr[i]);
     }
     return sum;
 }
}

