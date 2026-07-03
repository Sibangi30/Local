public class Zero {
    public static int countZerosMath(long number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        long temp = Math.abs(number); // Handle negative numbers

        while (temp > 0) {
            if (temp % 10 == 0) {
                count++;
            }
            temp /= 10; // Remove the last digit
        }
        return count;
    }

    public static void main(String[] args) {
        long number = 100405L;
        System.out.println("Number of zeros: " + countZerosMath(number)); // Output: 3
    }
}
