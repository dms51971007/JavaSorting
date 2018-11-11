import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        final int SIZE_ARRAY = 15000000;
//        Sorting bs = new BubbleSort(SIZE_ARRAY);
//        bs.startSorting();
//        bs.printList();

        Sorting ms = new MyQSort(SIZE_ARRAY);
        ms.startSorting();
        //ms.printList();

        ms = new MyQ1Sort(SIZE_ARRAY);
        ms.startSorting();
       // ms.printList();


     //   ms.startSorting();

        //QSort qs = new QSort(SIZE_ARRAY);
     //   List<Integer> li = new ArrayList<>(Arrays.asList(0, 8, 3, 8, 0, 3, 1, 1, 7, 9));

     //  qs.setSortList( li);
        //qs.printList();
       // qs.printList();
    }
}
