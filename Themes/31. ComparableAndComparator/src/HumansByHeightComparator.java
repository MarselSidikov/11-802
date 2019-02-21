import java.util.Comparator;

/**
 * 20.02.2019
 * HumansByHeightComparator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HumansByHeightComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
