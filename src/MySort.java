/**
 * Created by r2 on 26.06.2017.
 */
public class MySort extends Sorting {
    public MySort(Integer num) {
        super(num);
    }


    @Override
    public void sort() {
        for (int i = 0; i < sortList.size(); i++) {
            Integer maxValue = sortList.get(i);
            Integer maxIndex = i;
            for (int j = i; j < sortList.size(); j++) {
                if(sortList.get(j) > maxValue)
                {
                    maxIndex = j;
                    maxValue = sortList.get(j);
                }
            }
            if (!maxIndex.equals(i))
            {
                swap(i,maxIndex);
            }

        }
    }
}

