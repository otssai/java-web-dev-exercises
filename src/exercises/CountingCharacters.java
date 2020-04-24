package exercises;
import java.util.HashMap;
import java.util.ArrayList;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInQuote = quote.toCharArray();
//        System.out.println(charactersInQuote);

        HashMap<String, Double> counting = new HashMap();

        ArrayList<Character> characters = new ArrayList<>();

        for (char eachCharacter : charactersInQuote) {
            if (!characters.contains(eachCharacter)) {
                characters.add(eachCharacter);
            }

            System.out.println(characters);

        }

    }
}
