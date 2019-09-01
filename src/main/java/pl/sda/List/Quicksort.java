package pl.sda.List;

public class Quicksort {
    public IList sort (IList<Integer> list,int startIndex, int stopIndex){
        if (startIndex >= stopIndex)
            return list;
        int pivot = stopIndex;
        pivot = splitTable(pivot, list, startIndex, stopIndex);
        sort(list,startIndex,pivot-1);
        return sort(list, pivot+1, stopIndex);
    }

    private int splitTable(int pivot, IList<Integer> list, int startIndex, int stopIndex) {
        for (int i = startIndex; i< pivot;i++) {
            if (list.get(i)>= list.get(pivot)){
                list.add(pivot+1, list.get(1));
                list.remove(i);
                pivot --;
                i--;
            }
        }return pivot;
    }
}
