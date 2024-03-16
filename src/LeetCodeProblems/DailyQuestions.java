package LeetCodeProblems;
import java.util.HashMap;
public class DailyQuestions {
    public static void main(String[] args) {
        int[] nums  = {0, 0, 0, 1, 1, 0, 0, 1, 1, 0};

        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        if(nums.length < 3) {
            return nums.length;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum = sum + 1;
            } else {
                sum = sum - 1;
                if (sum < 0) {
                    sum = 0;
                }
            }
            res[i] = sum;
        }
        int i = res.length - 1;
        int j = i - 1;
        int max = 0;
        while (i > 0) {
            while (j >= 0) {
                if (res[i] == res[j]) {
                    int diff = i - j;
                    max = Math.max(max, diff);
                }
                j--;
            }
            i--;
            j = i - 1;
        }
        return max;

    }
}
