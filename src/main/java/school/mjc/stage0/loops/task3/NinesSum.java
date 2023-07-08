package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int lastNumber = 0;
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            if (i == 1) {
                sum += 9;
                lastNumber = sum;
            } else {
                lastNumber = lastNumber + (9 * (int) Math.pow(10, i - 1));;
                sum += lastNumber;
            }
        }
        System.out.println(sum);
    }
}
