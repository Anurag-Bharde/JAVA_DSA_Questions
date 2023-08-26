package ArrayList;

import java.util.*;

public class subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
    public static List<List<Integer>> generateSubsets(int[] nums) {
        return generateSubsetsHelper(nums, 0);
    }

    public static List<List<Integer>> generateSubsetsHelper(int[] nums, int index) {
        if (index == nums.length) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>()); // Empty subset
            return result;
        }

        List<List<Integer>> subsets = generateSubsetsHelper(nums, index + 1);
        int current = nums[index];

        List<List<Integer>> newSubsets = new ArrayList<>(subsets);
        for (List<Integer> subset : subsets) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(current);
            newSubsets.add(newSubset);
        }

        return newSubsets;
    }
}
