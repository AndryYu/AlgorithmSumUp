package charter06;

public class Sort05Quick extends BaseSort {
    @Override
    public Integer[] sort(Integer[] a) {
        sort(a, 0, a.length-1);
        print("result", a);
        return a;
    }

    public void sort(Integer[] arr, int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }

        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) sort(arr, low, l - 1);
        if (h < high) sort(arr, l + 1, high);
    }

    public static void main(String[] args) {
        Sort05Quick insert = new Sort05Quick();
        Integer[] a = {2,1,5,9,0,6,8,7,3};
        insert.sort(a);
    }
}
