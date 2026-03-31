import java.util.*;

public class Solution {
    public static int[] longestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) sum -= 1;
            else sum += 1;
            if (sum == 1) {
                if (i + 1 > maxLen) {
                    maxLen = i + 1;
                    start = 0;
                    end = i;
                }
            }

            
            if (map.containsKey(sum - 1)) {
                int prevIndex = map.get(sum - 1);
                if (i - prevIndex > maxLen) {
                    maxLen = i - prevIndex;
                    start = prevIndex + 1;
                    end = i;
                }
            }

            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        if (start == -1) return new int[0];

        int[] result = new int[maxLen];
        for (int i = 0; i < maxLen; i++) {
            result[i] = arr[start + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0};
        System.out.println(Arrays.toString(longestSubarray(arr)));
    }
}