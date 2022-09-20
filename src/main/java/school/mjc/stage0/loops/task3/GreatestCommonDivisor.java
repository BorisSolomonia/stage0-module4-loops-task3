package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int n = Math.min(first, second);
        int f = Math.max(first, second);
        int r = n;
        int k = 1;
        while (k != 0){
            n--;
            k = f%n + r%n;
            System.out.println(n);
        }
        System.out.println("the last n "+n);
    }
}
