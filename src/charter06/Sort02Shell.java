package charter06;

public class Sort02Shell extends BaseSort {
    @Override
    public Integer[] sort(Integer[] a) {
        int d = a.length;
        print("init",a);
        while (true) {
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i = i + d) {
                    int temp = a[i];
                    int j;
                    //
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
                print(x+"", a);
            }
            if (d == 1) {
                break;
            }
        }
        print("result", a);
        return a;
    }

    public static void main(String[] args) {
        Sort02Shell insert = new Sort02Shell();
        Integer[] a = {2,1,5,9,0,6,8,7,3};
        insert.sort(a);
    }
}
