package backMapper.author;

import backService.author.SysRole;
import org.apache.ibatis.annotations.Param;
import platform.mybatis.MyBatisRepository;

import java.util.HashMap;
import java.util.List;

@MyBatisRepository
public interface SysRoleMapper {
	int removeById(@Param("id") Integer id, @Param("orderNumber") Integer orderNumber);

	int insert(SysRole record);

	int insertSelective(SysRole record);

	SysRole getRoleById(Integer id);

	SysRole getRoleBySym(String sym);

	int updateByPrimaryKeySelective(SysRole record);

	int updateById(SysRole record);

	List<SysRole> listByPara(HashMap<Object, Object> para);
	/**
	 * 获取最大的ordernumber值
	 * 
	 * @return
	 */
	Integer getMaxOrder();
	/**
	 * 获取向上移动时需要交换的节点信息
	 * 
	 * @param orderNumber
	 * @return
	 */
	SysRole getRoleMoveUp(@Param("orderNumber") Integer orderNumber);

	/**
	 * 获取向下移动时需要交换的节点信息
	 * 
	 * @param orderNumber
	 * @return
	 */
	SysRole getRoleMoveDown(@Param("orderNumber") Integer orderNumber);
}
