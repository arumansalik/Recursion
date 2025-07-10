package Example;//binary search using recursion


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 77};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int mid = s + (e - s) /2;
        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return search(arr, target, s+1, e);
        }

        return search(arr, target, s, e-1);
    }
}
