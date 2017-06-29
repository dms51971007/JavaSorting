import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by r2 on 26.06.2017.
 */
public abstract class Sorting {
    List<Integer> sortList;

    long time;

    public Sorting(Integer num) {
        Random r = new Random();
        sortList = new ArrayList<>();
        for (int i = 0; i < num; i++)
            sortList.add(r.nextInt(num));

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
            System.out.println(sortList.get(i));
    }
    public abstract void sort();

}
