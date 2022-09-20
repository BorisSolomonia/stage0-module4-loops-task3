package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int n = 0;
        for (int i = firstBoarder+1; i < secondBoarder; i++) {
            n += i;
        }
        System.out.println(n);
    }
}
