package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class XiangDuiMingCi {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] copy = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(copy, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < copy.length ; i++) {
            map.put(copy[i], i + 1);
        }
        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int order = map.get(nums[i]);
            String s;
            if(order == 1) {
                s = "Gold Medal";
            }
            else if(order == 2) {
                s = "Silver Medal";
            }
            else if(order == 3) {
                s = "Bronze Medal";
            }
            else {
                s = String.valueOf(order);
            }
            res[i] = s;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] question = {5, 4, 3, 2, 1};
        XiangDuiMingCi xiangDuiMingCi = new XiangDuiMingCi();
        String [] result = xiangDuiMingCi.findRelativeRanks(question);
        int len = result.length;
        for (int i= 0;i<len;i++){
            System.out.println(result);
        }
    }
}
