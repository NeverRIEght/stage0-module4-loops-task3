package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            if (i == 1) {
                sum += 9;
            } else {
                sum += 9 * (int) Math.pow(10, i - 1) + sum;
            }
        }
        System.out.println(sum);
    }
}
