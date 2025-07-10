package Pattern;

import java.util.ArrayList;

public class SumSubSequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 2;
        printSub(0, arr,0, sum, list);
    }



    static void printSub(int i, int[] arr,int s, int sum, ArrayList<Integer> list) {
        if(i == arr.length) {
            if(s == sum) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        s += arr[i];
        printSub(i + 1, arr, s, sum, list);
        list.remove(list.size() - 1);
        s -= arr[i];
        printSub(i + 1, arr, s, sum, list);
    }
}


/*Start with empty list []

1. Include 3
   2. Include 1
     3. Include 2 -> [3, 1, 2]
      4. Exclude 2 -> [3, 1]
   5. Exclude 1
      6. Include 2 -> [3, 2]
     7. Exclude 2 -> [3]
8. Exclude 3
   9. Include 1
      10. Include 2 -> [1, 2]
      11. Exclude 2 -> [1]
   12. Exclude 1
      13. Include 2 -> [2]
      14. Exclude 2 -> []
*/