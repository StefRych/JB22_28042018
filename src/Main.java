import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("janek","Juzek","Felek", "Marek", "Kaśka", "Julka"));

        Nameator nameator = (String s)->{
            return s.toUpperCase();
        };

        System.out.println(nameator.getName("Janek"));

        //inny sposób utworzenia listy
        //List<String>names = new ArrayList<>(Arrays.asList("Janek","Juzek","Felek", "Marek", "Kaśka", "Julka"));
        names.sort((s,s1)->s.compareTo(s1));
        names.forEach(System.out::println);

        //sortowanie odwrotne
        System.out.println("------------");
        names.sort((s,s1)->s.compareTo(s1)*-1);

        //zapis zastąpinony przez Lamba

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2) * -1;
//            }
//        });

        names.forEach(System.out::println);


        System.out.println("----");

        List<String>players = Arrays.asList("Maniek", "Wacek", "Franek", "Juzek");
        //old looping
        for (String player : players) {
            System.out.println(player + ";");
        }

        System.out.println("----------");

        //using lamba expression and functional operations
        players.forEach((player)-> System.out.println(player + ";"));





    }
    //zmiana
    //zmiana 2
    //zmiana3
}
