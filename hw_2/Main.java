package itvdn_homeworks.lambda.hw_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nazarii Soviak
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int quad = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();

        System.out.println(quad);

    }
}
