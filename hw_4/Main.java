package itvdn_homeworks.lambda.hw_4;

/**
 * @author Nazarii Soviak
 */

public class Main {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        Operation left = (a, b) -> a % b;

        int sumResult = sum.calculate(200,560);
        int subResult = sub.calculate(865,85);
        int mulResult = mul.calculate(83,3);
        int divResult = div.calculate(560,2);
        int leftResult = left.calculate(245,2);

        System.out.println(subResult + "\n" + sumResult + "\n" +
                mulResult + "\n" + divResult + "\n" + leftResult);

    }
}

@FunctionalInterface
interface Operation {

    public int calculate(int a, int b);

}
