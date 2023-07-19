package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 9;
        int currentNum = 9;
        for (int i = 2; i <= lengthOfLastNumber; i++) {
            currentNum = currentNum * 10 + 9;
            sum += currentNum;
        }
        if (lengthOfLastNumber <= 0)
            System.out.println(0);
        else
            System.out.println(sum);
    }
}
