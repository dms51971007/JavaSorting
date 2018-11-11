public class MyQ1Sort extends Sorting {
    public MyQ1Sort(Integer num) {
        super(num);
    }

    @Override
    public void sort() {
        q1sort(0, sortList.size() - 1);
    }

    private void q1sort(int begin, int end) {

        int wall = begin;
        int piv = sortList.get(end);
        int numPiv = 0;
//        printList(begin, end);

        for (int i = begin; i <= end - 1; i++) {
            if (sortList.get(i) < piv) {
                if (i - wall != 0)
                    swap(wall, i);
                wall++;
            }
        }
        swap(wall, end);


        if (wall > begin) q1sort(begin, wall - 1);
        if (end > wall) q1sort(wall + 1, end);


    }


}
