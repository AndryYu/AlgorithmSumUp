package charter06;

public class Sort04Bubble extends BaseSort{
    @Override
    public Integer[] sort(Integer[] arr) {
        print("init",arr);
        for(int i =0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {//-1为了防止溢出
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print("result", arr);
        return arr;
    }

    public static void main(String[] args) {
        Sort04Bubble insert = new Sort04Bubble();
        Integer[] a = {2,1,5,9,0,6,8,7,3};
        insert.sort(a);
    }
}
