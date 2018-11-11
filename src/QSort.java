/**
 * Created by r2 on 26.06.2017.
 */
public class QSort extends Sorting {
    public QSort(Integer num) {
        super(num);
    }


    @Override
    public void sort() {
        qSort(0, sortList.size() - 1);
    }

   /*   public void qSort(int begin, int end) {
          if (begin < end) {
              int pivInd = (begin + end) / 2;
              Integer pivValue = sortList.get(pivInd);
              for (int i = begin; i <= end; i++) {
                  if (i < pivInd) {
                      if (compare(sortList.get(i), pivValue)) {
                          swap(i, pivInd);
                          pivInd = i;
                      }
                  }
                  if (i > pivInd) {
                      if (!compare(sortList.get(i), pivValue)) {

                          swap(pivInd + 1, pivInd);
                          if ((pivInd + 1) != i)
                              swap(pivInd, i);
                          pivInd = pivInd + 1;
                      }
                  }
              }
              qSort(begin, pivInd - 1);
              qSort(pivInd + 1, end);

          }
      }*/

  /*  public void qSort(int low, int high) {
        int i = low;
        int j = high;
        int x = sortList.get(low + (high - low) / 2);
        do {
            while (sortList.get(i) < x) ++i;
            while (sortList.get(j) > x) --j;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        } while (i <= j);
        //рекурсивные вызовы функции qSort
        if (low < j) qSort(low, j);
        if (i < high) qSort(i, high);
    }*/


    public void qSort(int begin, int end) {

        int i = begin;
        int j = end;

        Integer pivValue = sortList.get((i + j) / 2);

        while (i < j) {
            while (compare(pivValue, sortList.get(i)))
                i++;
            while (compare(sortList.get(j), pivValue))
                j--;

            if (i <= j)
                swap(i++, j--);

        }

        if (i < end) qSort(i, end);
        if (begin < j) qSort(begin, j);

    }



    Boolean compare(Integer n1, Integer n2) {
        return n1 > n2;
    }

}