import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumber = new LinkedList<>();
        for (int number : intList) {
            if ((number > 0) && (number % 2 == 0)) {
                positiveNumber.add(number);
            }
        }
        Collections.sort(positiveNumber);
        System.out.println(positiveNumber);
        StreamMain.main();

    }

    public static class StreamMain {
        public static void main() {
            List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

            Stream<Integer> stream = intList.stream();
            stream
                    .filter(x -> x > 0)
                    .filter(x -> x % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);

        }
    }
}
