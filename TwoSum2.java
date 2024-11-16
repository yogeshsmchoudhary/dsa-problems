
import java.util.HashSet;

class TwoSum2 {
  Set<List<Integer>> resultSet = new HashSet<>(); // Use a set to prevent duplicates
        List<List<Integer>> resultList = new ArrayList<>();

        // Nested loops to find all triplets
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create and sort the triplet
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // Ensure consistent ordering
                        resultSet.add(triplet); // Add the triplet to the set
                    }
                }
            }
        }

        // Convert the set to a list
        resultList.addAll(resultSet);
        return resultList;
        
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
       threeSum(arr);
    }
}
