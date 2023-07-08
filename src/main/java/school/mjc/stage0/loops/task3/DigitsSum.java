package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int digitsCount = ("" + t).length();
        int sum = 0;

        for (int i = 1; i <= digitsCount; i++) {
            int divider = (int)Math.pow(10, i);
            if(i == 1) {
                sum += t % divider;
            } else {
                sum += ((t % divider) - (t % (divider / 10))) / (divider / 10);
            }
        }
        sum = sum < 0 ? -sum : sum;
        System.out.println(sum);
    }
}
