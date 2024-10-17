
public class Orderagnostic {
    public static void main(String[] args) {
        int[] arr = { 11, 10, 9, 8, 7, 6, 5 };
        int target = 19;
        int ans = OrderagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;

            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;

                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
}
