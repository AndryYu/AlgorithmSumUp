package charter06;

public abstract class BaseSort {

    public abstract Integer[] sort(Integer[] a);

    public static void print(Integer[] arrayForSort) {
        System.out.print("[");
        for (int i = 0; i < arrayForSort.length; i++) {
            if (i == arrayForSort.length - 1) {
                System.out.print(arrayForSort[i]);
            } else {
                System.out.print(arrayForSort[i] + " ,");
            }
        }
        System.out.println("]");
    }


    public static void print(String prefix,Integer[] arrayForSort) {
        System.out.print(prefix + ": ");
        print(arrayForSort);
    }
}
