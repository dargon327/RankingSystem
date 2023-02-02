public class Main {
    public static void main(String[] args) {
        UserTester test = new UserTester();
        test.testToString();
        test.testActivityRankOutOfBoundsEqualToZero();
        test.testActivityRankOutOfBoundsGreaterThanEight();
        test.testActivityRankOutOfBoundsLessThanNegativeEight();
        test.testConstructorRankProgressStartsAtZero();
        test.testConstructorRankStartsAtNegativeEight();
        test.testRankUpActivity();
        test.testVariousRankUpActivity();
    }
}