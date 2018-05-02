package Task2;
//Stwórz funkcję map, która zmienia elementy listy (ma zwrócić nową listę) Dla wywołania:
//List<Integer> elements = new ArrayList<>();
// elements.add(5);
// elements.add(8);
// elements.add(12);
// System.out.println(MyArray.map(elements, (a) -> a + 5));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer>integers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println( map(integers,s->s+5));

    }

//    public static <T extends Number>List<Number> map(List<T> list, IntUnaryOperator operator){
//        List<Number>newList = new ArrayList<>();
//        for (T t : list) {
//            newList.add(operator.applyAsInt((Integer)t));
//        }
//        return newList;
//    }

    //zadanie ograniczone do typu int

    public static List<Integer> map(List<Integer> list, IntUnaryOperator operator){
        List<Integer> newList = new ArrayList<>();
//        for (Integer integer : list) {
//            newList.add(operator.applyAsInt(integer));
//        }
        list.forEach(s->newList.add(operator.applyAsInt(s)));
        return newList;
    }
}
