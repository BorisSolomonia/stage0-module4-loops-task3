package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int n = 0;
        String nines = "";
        for (int i = 0; i < lengthOfLastNumber; i++) {
            nines +="9";
            n += Integer.parseInt(nines);
        }
        System.out.println(n);
    }
}
