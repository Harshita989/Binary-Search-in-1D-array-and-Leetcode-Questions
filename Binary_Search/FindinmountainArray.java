public class FindinmountainArray {
    public static void main(String[] args) {

    }

    int searchMA(int[] arr, int target) {
        int peak = MA(arr);
        int firsttry = OrderagnosticBS(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        } else {
            return OrderagnosticBS(arr, target, peak+1, arr.length-1)

        }

    }

    static int MA(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;

            }
        }
        return start;

    }

    static int OrderagnosticBS(int[] arr, int target, int start, int end) {

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
