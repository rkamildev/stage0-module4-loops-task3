package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibOne = 1;
        int fibTwo = 1;
        int fibNext;
        if (lastFibonacci == 1)
            System.out.println(1);
        if (lastFibonacci == 2)
            System.out.println(1);
        for (int i = 1; i <= lastFibonacci; i++) {
            if (i == 1)
                System.out.println(0);
            else if (i == 2)
                System.out.println(1);
            else if (i == 3)
                System.out.println(1);
            else {
                fibNext = fibOne + fibTwo;
                System.out.println(fibNext);
                fibOne = fibTwo;
                fibTwo = fibNext;
            }
        }
    }
}
