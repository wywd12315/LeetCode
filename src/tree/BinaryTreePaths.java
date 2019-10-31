package tree;
import java.util.List;
import java.util.LinkedList;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result=new LinkedList<>();
		help(root,"",result);
		return result;
	}
	public void help(TreeNode root,String path,List<String> result){
		if(root!=null)
		{
			path+=Integer.toString(root.val);
			if(root.left==null&&root.right==null){
				result.add(path);
				}
			else{
				path+="->";
				help(root.left,path,result);
				help(root.right,path,result);
				}
		}
	}
}
