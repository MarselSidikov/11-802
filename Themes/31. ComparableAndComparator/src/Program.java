import java.util.Comparator;
import java.util.Scanner;

/**
 * 19.02.2019
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("Айрат", 20, 1.70));
        list.add(new Human("Марк", 17, 1.82));
        list.add(new Human("Марсель", 25, 1.85));
        list.add(new Human("Аделя", 19, 1.65));
        list.add(new Human("Артур", 18, 1.73));
//        Sorter.sort(list);
//        Comparator<Human> comparator = new HumansByHeightComparator();
//
//        Sorter.sort(list, new HumansByHeightComparator());

//        Sorter.sort(list, (human1, human2) -> {
//            return Double.compare(human1.getHeight(), human2.getHeight());
//        });

        Sorter.sort(list, Comparator.comparingDouble(Human::getHeight));

        for (Human human : list) {
            System.out.println(human);
        }

        ArrayList<Scanner> scanners = new ArrayList<>();
        scanners.add(new Scanner(System.in));
        scanners.add(new Scanner(System.in));
        scanners.add(new Scanner(System.in));

//        Sorter.sort(scanners);
    }
}
