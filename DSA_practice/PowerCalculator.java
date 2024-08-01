import java.util.*;
public class PowerCalculator {
    public static double power(double x, int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 3;
        double result = power(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);
    }
}
