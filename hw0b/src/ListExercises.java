import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (Integer integer : L) {
            sum += integer;
        }
        // TODO: Fill in this function.
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        ArrayList<Integer> Evens = new ArrayList<>();
            for (Integer i : L) {
                if (i % 2 == 0) {
                    Evens.add(i);
                }
            }
            return Evens;
//        return null;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        ArrayList<Integer> Commons = new ArrayList<>();
        for (Integer i : L1) {
            for (Integer j : L2) {
                if (i == j) {
                    Commons.add(i);
//                    break;
                }
            }
        }
        return Commons;
//        return null;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String word : words) {
            for (Character ch : word.toCharArray()) {
                if (c == ch) {count += 1;}
            }
        }
        return count;
    }
}
