public class Main {

    public static void reverse(double[] arr) {
        int i = 0;
        int j = arr.length - 1;
        double temp;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        double[] values = {5.8, 2.6, 9.0, 3.4, 7.1};
        reverse(values);

        for (double v : values) {
            System.out.print(v + " ");
        }
    }
}
