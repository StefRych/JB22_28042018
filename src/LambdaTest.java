import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Janek", "Juzek","Franek","Jacek","maniek"));

        names.sort((s,s1)->s1.compareTo(s));
        //names.sort(Comparator.reverseOrder());
        names.forEach(System.out::println);
    }
}
