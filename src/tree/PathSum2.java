package tree;
import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        backTrack(result, solution, root, sum);
        return result;
    }
    public void backTrack(List<List<Integer>> result, List<Integer> solution, TreeNode root, int sum){
        if (root == null){
            return;
        }
        solution.add(root.val);
        if (root.left == null && root.right == null && root.val == sum){
            result.add(new ArrayList(solution));
        } else {
            backTrack(result, solution, root.left, sum - root.val);
            backTrack(result, solution, root.right, sum - root.val);
        }
        solution.remove(solution.size() - 1);
    }
}
