public class binarS {
    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        for (; start <= end; ) {   // for loop without init & update

            int mid = start + (end - start) / 2;

            if (arr[mid] == target-) {
                return mid;   // index
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 10;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}

    

