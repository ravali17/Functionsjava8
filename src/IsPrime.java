import java.util.function.Function;

public class IsPrime {
    public static void main(String[] args) {
        Function<Integer, Boolean> isPrime = (x) -> {
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
        boolean b = isPrime.apply(23);
        System.out.println(b);
    }
}
