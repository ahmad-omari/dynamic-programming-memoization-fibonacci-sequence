import java.util.HashMap;
import java.util.Map;

/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/21/2022, Friday
 * @project : dynamic-programming-memoization-fibonacci-sequence
 **/
public class FibonacciSequence {

    public static long fib(long num, Map<Long, Long> memo) {
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        if (num <= 2) {
            return 1;
        }
        memo.put(num, fib(num - 1, memo) + fib(num - 2, memo));
        return memo.get(num);
    }

    public static void main(String[] args) {
        System.out.println(fib(5, new HashMap<>()));
        System.out.println(fib(6, new HashMap<>()));
        System.out.println(fib(7, new HashMap<>()));
        System.out.println(fib(8, new HashMap<>()));
        System.out.println(fib(100, new HashMap<>()));
    }
}
