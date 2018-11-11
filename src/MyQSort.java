
public class MyQSort extends Sorting {

    public MyQSort(Integer num) {
        super(num);
    }

    @Override
    public void sort() {
        qsort(0,sortList.size()-1);
    }

    private void qsort(Integer begin, Integer end) {
        int n1 = begin;
        int n2 = end;
        Integer mid = (n1 + n2) / 2;
        Integer midElement = sortList.get(mid);
        while (n1 < n2) {

            while (sortList.get(n1) < midElement)
                n1++;

            while (sortList.get(n2) > midElement)
                n2--;

            if (n1 <= n2)
                swap(n1++, n2--);

        }

        if (n1 < end )
            qsort(n1, end);

        if (n2 > begin )
            qsort(begin, n2);

    }
}
