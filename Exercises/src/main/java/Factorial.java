public class Factorial {

    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }

    public static int getFactorial(int startingNumber) {
        int factorial = startingNumber;
        startingNumber = startingNumber - 1;

        while (startingNumber > 0) {
            factorial *= startingNumber;
            startingNumber -= 1;
        }

        return factorial;
    }
}
