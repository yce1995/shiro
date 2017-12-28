package cn.et.shiro.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Select;

import cn.et.shiro.entity.Menu;
import cn.et.shiro.entity.UserInfo;

public interface UserMapper {
	@Select("select user_name as userName,pass_word as password from user_info where user_name=#{0}")
	public UserInfo queryUser(String userName);
	
	@Select("select * from user_info u INNER JOIN user_role_relation urr on u.user_id=urr.user_id" +
			" INNER JOIN role r on urr.role_id = r.role_id where user_name=#{0}")
	public Set<String> queryRoleByName(String userName);
	
	@Select("select p.perm_tag from user_info ui,user_role_relation urr,role r,role_perms_relation rpr,perms p " +
			"where ui.user_id=urr.user_id AND urr.role_id=r.role_id and r.role_id=rpr.role_id and rpr.prem_id=p.prem_id " +
			"and ui.user_name=#{0}")
	public Set<String> queryPermsByName(String userName);
	
	@Select("select menu_id as menuid,menu_name as menuname,menu_url as menuurl,menu_filter as menufilter,is_menu as ismenu from menu;")
	public List<Menu>queryMenu();
	
	@Select("select menu_id as menuid,menu_name as menuname,menu_url as menuurl,menu_filter as menufilter,is_menu as ismenu from menu where menu_url=#{0};")
	public List<Menu>queryMenuByUrl(String url);
	
	@Select("select menu_name as menuname,menu_url as menuurl,menu_filter as menufilter,is_menu as ismenu from menu m,user_menu_relation umr,user_info ui where m.menu_id=umr.menu_id and ui.user_id=umr.user_id and ui.user_name=#{0}")
	public List<Menu>queryMenuByUser(String userName);
}
