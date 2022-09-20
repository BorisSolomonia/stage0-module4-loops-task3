package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String len = String.valueOf(t);
        int n = 0;
        int k = 0;
        while (n < len.length()){
            k += Integer.parseInt(String.valueOf(len.charAt(n)));
            n++;
        }
        System.out.println(k);
    }
}
