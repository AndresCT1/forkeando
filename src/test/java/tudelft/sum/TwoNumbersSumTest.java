package tudelft.sum;
import java.util.ArrayList;
import java.util.Arrays;
public class TwoNumbersSumTest {
    public static void main(String[] args) {
        TwoNumbersSum sumCalculator = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(5, 6, 4));

        ArrayList<Integer> result = sumCalculator.addTwoNumbers(num1, num2);

        System.out.println("Suma: " + result);
    }
}
