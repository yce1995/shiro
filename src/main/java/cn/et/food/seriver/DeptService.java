package cn.et.food.seriver;

import java.util.List;

import cn.et.food.entity.Emp;
import cn.et.food.entity.TreeNode;

public interface DeptService {

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.FoodService#queryFood(java.lang.String)
	 */
	public abstract List<TreeNode> queryTreeNode(Integer pid);
	
	public List<Emp> queryEmp(Integer id,String name);
	
	public void saveFood(Emp emp);
	
	public void updateEmp(Emp emp);
	
	public void deleteEmp(Integer id);
}