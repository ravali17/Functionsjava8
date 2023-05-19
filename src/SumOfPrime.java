import java.util.function.Function;

public class SumOfPrime {
    public static int sum(int arr[], Function<Integer, Integer> fun) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + fun.apply(arr[i]);

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 10, 23};
        Integer r1 = sum(arr, (x) -> x);
        System.out.println(r1);
        Function<Integer,Boolean> isPrime = (x) -> {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
                if (count > 2) {
                    break;  // Terminate the loop if count exceeds 2
                }
            }
            return count == 2;  // Return true if count is 2 (prime), false otherwise
        };
        boolean b = isPrime.apply(2);
        System.out.println(b);
    }
}


