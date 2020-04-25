package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.*;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String quote = input.nextLine().toLowerCase();
        input.close();
        char[] characterArray = quote.toCharArray();
        //        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> countingMap = new HashMap<>();

        for (char each : characterArray) {
            if (!countingMap.containsKey(each) && Character.isLetter(each)) {
                countingMap.put(each, 1);
            } else if (countingMap.containsKey(each) && Character.isLetter(each)) {
                countingMap.put(each, countingMap.get(each)+1);
            }
        }

        for (Map.Entry<Character, Integer> pair : countingMap.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
