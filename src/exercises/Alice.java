package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to " +
                "do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a term to search: ");
        String term = input.nextLine().toLowerCase();
        input.close();

        if (sentence.toLowerCase().contains(term)) {
            System.out.println("true");
            int index = sentence.toLowerCase().indexOf(term);
            int length = term.length();
            System.out.println("Index of the term: " + index);
            System.out.println("Length of the term: " + length);
            String modifiedSentence = sentence.substring(0,index).concat(sentence.substring(index+length));
            System.out.println(modifiedSentence);
        } else {
            System.out.println("false");
        }
    }
}

