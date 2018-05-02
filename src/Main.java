import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("janek","Juzek","Felek", "Marek", "Kaśka", "Julka"));



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

        System.out.println("--------");

        //        Nameator nameator = (String s)->{
//            return s.toUpperCase();
//        };
        //skrócony zapis lamba
//        Nameator nameator = s->s.toUpperCase();
//        Nameator nameator1 = s->s.toLowerCase();
//        Nameator nameator2 = s-> String.valueOf(s.length());
//
//        System.out.println(nameator2.getName("Janek"));

        showMe(s->s.toLowerCase(),"HEJO");
        showMe(s->s.toUpperCase(),"hejo");
        showMe(s->s.concat(" - to doklejka z lamby "),"hejo");
        showMe(s->String.valueOf(s.charAt(0)),"hejo");
        showMe(s-> String.valueOf(s.length()), "Helo");
        showMe(s-> String.valueOf(s.charAt(3)),"Marta");



    }
    public static void showMe(Nameator nameator,String name){
        System.out.println(nameator.getName(name));

    }

}
