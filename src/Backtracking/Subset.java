package Backtracking;
import java.util.*;


public class Subset {

    public static void main(String[] args){
        Subset s = new Subset();
        int[] nums = {1, 2 , 3};
        List<List<Integer>> subsets = s.subsets(nums);
        System.out.println(subsets);

    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums,0, current, res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
