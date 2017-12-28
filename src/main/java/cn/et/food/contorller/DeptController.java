package cn.et.food.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.et.food.entity.Emp;
import cn.et.food.entity.Result;
import cn.et.food.entity.TreeNode;
import cn.et.food.seriver.DeptService;

@RestController
public class DeptController {
	@Autowired
	DeptService ds;
	@ResponseBody
	@RequestMapping("/queryDept")
	public List<TreeNode> queryDept(Integer id){
		if(id==null){
			id=0;
		}
		return ds.queryTreeNode(id);
	}
	
	@ResponseBody
	@RequestMapping("/queryEmp")
	public List<Emp> queryEmp(Integer id,String ename){
		return ds.queryEmp(id,ename);
	}
	
	
	@ResponseBody
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST)
	public Result saveEmp(Emp emp){
		Result r = new Result();
		try {
			r.setCode(1);
			ds.saveFood(emp);
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateEmp/{id}",method=RequestMethod.PUT)
	public Result UpdateEmp(@PathVariable Integer id,Emp emp){
		emp.setId(id);
		Result r = new Result();
		try {
			r.setCode(1);
			ds.updateEmp(emp);
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
	
	@ResponseBody
	@RequestMapping(value="/deleteEmp/{id}",method=RequestMethod.DELETE)
	public Result deleteFood(@PathVariable String id){
		String[] s = id.split(",");
		Result r = new Result();
		try {
			r.setCode(1);
			for (int i = 0; i < s.length; i++) {
				ds.deleteEmp(new Integer(s[i]));
			}
		} catch (Exception e) {
			r.setCode(0);
			r.setMessage(e);
		}
		return r;
	}
}
