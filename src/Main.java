import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Janek","Juzek","Felek", "Marek", "Kaśka", "Julka"));
        names.sort((s,s1)->s.compareTo(s1));
        names.forEach(System.out::println);
    }
    //zmiana
    //zmiana 2
    //zmiana3
}
