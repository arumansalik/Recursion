package Example;

public class JumpGame2 {
    public static int findMin(int[] arr, int index, int jumps) {
        int n = arr.length;
        if(index >= n - 1) return jumps;

        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            mini = Math.min(mini, findMin(arr, index + 1, jumps + 1));
        }
        return mini;
    }
}
