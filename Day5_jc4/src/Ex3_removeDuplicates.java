import java.util.*;

/**
 * Created by DEV on 9/11/2016.
 */
public class Ex3_removeDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "1", "3", "2", "1"));
        ArrayList<String> a = removeDuplicates(list);
        for (String s : a) {
            System.out.println(s);
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        Set<E> set = new HashSet<E>(list);
        ArrayList<E> arrayList = new ArrayList<E>();
        arrayList.addAll(set);
        return arrayList;
    }
}
