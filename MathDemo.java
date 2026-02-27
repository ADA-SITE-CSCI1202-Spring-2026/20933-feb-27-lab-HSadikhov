public class MathDemo {

    public int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        return (float) sum(args) / args.length;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//The main advantage of defining these methods as static is that you can call them directly on the class itself without needing to create an instance of the MathDemo class first.