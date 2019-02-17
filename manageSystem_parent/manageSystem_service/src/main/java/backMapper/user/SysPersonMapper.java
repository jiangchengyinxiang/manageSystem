package backMapper.user;


import backService.user.SysPerson;
import platform.mybatis.MyBatisRepository;

import java.util.HashMap;
import java.util.List;

@MyBatisRepository
public interface SysPersonMapper {
	int removeById(Integer id);

	int insert(SysPerson record);

	int insertSelective(SysPerson record);

	SysPerson getPersonById(Integer id);

	int updateByPrimaryKeySelective(SysPerson record);

	int updateById(SysPerson record);

	List<SysPerson> listByPara(HashMap<Object, Object> para);
}