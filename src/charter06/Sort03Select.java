package charter06;

public class Sort03Select extends BaseSort {
    @Override
    public Integer[] sort(Integer[] a) {
        int minIndex = 0;
        int temp = 0;
        print("init",a);
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < a.length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //将最小元素放到本次循环的前端
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            print(i+"", a);
        }
        print("result", a);
        return a;
    }

    public static void main(String[] args) {
        Sort03Select insert = new Sort03Select();
        Integer[] a = {2,1,5,9,0,6,8,7,3};
        insert.sort(a);
    }
}
