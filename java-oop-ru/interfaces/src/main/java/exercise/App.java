package exercise;

import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> realty, int n) {
        return realty.stream()
                .sorted(Comparator.comparing(x -> x.getArea()))
                .limit(n)
                .map(y -> y.toString())
                .toList();
    }
}
// END
