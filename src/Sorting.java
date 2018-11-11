import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;

/**
 * Created by r2 on 26.06.2017.
 */
public abstract class Sorting {
    List<Integer> sortList;

    long time;

    public Sorting(Integer num) {
        Random r = new Random();
//        sortList = Arrays.asList(5, 5, 5, 1, 5, 1);

        sortList = new ArrayList<>();
        for (int i = 0; i < num; i++)
            sortList.add(r.nextInt(num));
         //sortList = Arrays.asList( 6, 8, 2, 9, 9, 1, 8, 2, 8, 0);

    }

    public void swap(int n1, int n2) {

        Integer tmp = sortList.get(n1);

        sortList.set(n1,sortList.get(n2));
        sortList.set(n2,tmp);
    }

    public List<Integer> getSortList() {
        return sortList;
    }

    public void setSortList(List<Integer> sortList) {
        this.sortList = sortList;
        this.time = -1;
    }

    public void startSorting() {
        long startTime = new Date().getTime();
        sort();
        time = new Date().getTime() - startTime;
        System.out.println("--------------------------------");

        System.out.println("Class: " + getClass().getName());
        System.out.println(" Time: " + time);
        System.out.println("--------------------------------");

    }

    public void printList()
    {
        System.out.println("List:");
        for(int i=0;i<sortList.size();i++)
            System.out.print(" " + sortList.get(i));
            System.out.println();
    }
    public void printList(int begin, int end)
    {
        System.out.print("List: ");
        for(int i=begin;i<=end;i++)
            System.out.print(" " + sortList.get(i));
        System.out.println();
    }
    public abstract void sort();

}
