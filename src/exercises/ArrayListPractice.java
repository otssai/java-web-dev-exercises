package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer i=1; i<11; i++) {
            nums.add(i);
        }
        System.out.println(sumOfEvenNums(nums));

        String limerick = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        List<String> arrOfLimerick = new ArrayList<String>();
        arrOfLimerick = Arrays.asList(limerick.split(" "));
        printFiveLetterWords(arrOfLimerick);

    }

    public static Integer sumOfEvenNums(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr)
            if (i % 2 == 0) {
                sum += i;
            }
        return sum;
    }

    public static void printFiveLetterWords(List<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length for the search: ");
        double length = input.nextDouble();
        input.close();
        for (String i : arr) {
            if (i.length() == length) {
                System.out.println(i);
            }
        }
    }
}
