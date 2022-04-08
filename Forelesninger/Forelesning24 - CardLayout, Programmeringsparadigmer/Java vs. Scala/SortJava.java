import java.util.ArrayList;

public class SortJava {

    private int[] list = new int[]{5,3,6,9,1,4,8,2,7};

    private int[] sort(int[] list) {
        for (int i=1; i<list.length; ++i) {
            int j = i-1;
            int element = list[i];
            while (j>=0 && element<list[j]) {
                list[j+1] = list[j];
                --j;
            }
            list[j+1] = element;
        }
        return list;
    }


    public static void main(String[] args) {
        SortJava app = new SortJava();
        int[] sorted = app.sort(app.list);
        for (int x : sorted)
            System.out.print(x + " ");
    }

}