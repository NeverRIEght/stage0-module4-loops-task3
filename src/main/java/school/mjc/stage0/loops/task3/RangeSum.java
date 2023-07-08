package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        while (firstBoarder <= secondBoarder) {
            result += firstBoarder;
            firstBoarder++;
        }
        System.out.println(result);
    }
}
