package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 0, f2 = 1, i;

        if (lastFibonacci < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < lastFibonacci; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
