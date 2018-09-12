package charter06;

public class Sort01Insert extends BaseSort{

    @Override
    public Integer[] sort(Integer[] a) {
        print("init",a);
        Integer temp = 0;
        for (int i=1;i<a.length;i++) {
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
            print(i+"", a);
        }
        print("result", a);
        return a;
    }

    public static void main(String[] args) {
        Sort01Insert insert = new Sort01Insert();
        Integer[] a = {2,1,5,9,0,6,8,7,3};
        insert.sort(a);
    }
}
