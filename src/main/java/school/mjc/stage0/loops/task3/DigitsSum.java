package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num = String.valueOf(Math.abs(t));
        int len = num.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            res += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(res);
    }
}
