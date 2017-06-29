/**
 * Created by r2 on 26.06.2017.
 */
public class BubbleSort extends Sorting {
    public BubbleSort(Integer num) {
        super(num);
    }

    @Override
    public void sort() {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 1; i < sortList.size(); i++) {
                if (sortList.get(i - 1) > sortList.get(i)) {
                    sorted = false;
                    swap((i - 1), (i));
                }
            }
        }
    }
}
