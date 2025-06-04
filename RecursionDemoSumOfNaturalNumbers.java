class RecursionDemoSumOfNaturalNumbers{
    static int SumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + SumOfNaturalNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        int result = SumOfNaturalNumbers(number);
        System.out.println("Sum of first " + number + " natural numbers is " + result);
    }
}