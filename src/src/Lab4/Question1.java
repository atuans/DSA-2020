package Lab4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Question1 {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int idx = 0; idx < 10; idx++) {
            list.add("" + idx);
        }
        //1
        System.out.printf("%-32s", "Go forward, use index:");
        for (int idx = 0; idx < list.size(); idx++) {
            System.out.printf("%s ", list.get(idx));
        }
        System.out.println();
        //2
        System.out.printf("%-32s", "Go backward, use index:");
        for (int idx = list.size() - 1; idx >= 0; idx--) {
            System.out.printf("%s ", list.get(idx));
        }
        System.out.println();
        //3
        System.out.printf("%-32s", "Go forward, use Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.printf("%s ", item);
        }
        System.out.println();
        //4
        System.out.printf("%-32s", "Go forward, use ListIterator:");
        ListIterator<String> fwd = list.listIterator();
        while (fwd.hasNext()) {
            String item = fwd.next();
            System.out.printf("%s ", item);
        }
        System.out.println();
        //5
        System.out.printf("%-32s", "Go backward, use ListIterator:");
        ListIterator<String> bwd = list.listIterator(list.size());
        while (bwd.hasPrevious()) {
            String item = bwd.previous();
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
