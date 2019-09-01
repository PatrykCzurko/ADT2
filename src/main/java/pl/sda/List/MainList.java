package pl.sda.List;

public class MainList {

    public static void main(String[] args) {

    Quicksort ss1 = new Quicksort();

        SelectionSort ss = new SelectionSort();
        IList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(0);
        list = ss1.sort(list,0,list.size()-1);
        Object holder = list.getHolderView();


        Object[] tab = list.getHolderView();

        for (Object val:tab)
            System.out.print(val + " ");
        System.out.println();

        int[] tabb =  {3, 1, 5, 11, 9};

        int[] sorted = ss.sort(tabb);
        for(int v:sorted)
            System.out.print(v + ", ");
    }
}
