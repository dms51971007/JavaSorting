import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        final int SIZE_ARRAY = 10000000;
        BubbleSort bs = new BubbleSort(SIZE_ARRAY);

       // bs.startSorting();
       // bs.printList();

        MySort ms = new MySort(SIZE_ARRAY);

     //   ms.startSorting();

        QSort qs = new QSort(SIZE_ARRAY);

     //   List<Integer> li = new ArrayList<>(Arrays.asList(4,9,5,7,8,16,12,1,18,3));

     //  qs.setSortList( li);
        //qs.printList();
        qs.startSorting();
       // qs.printList();
    }
}
