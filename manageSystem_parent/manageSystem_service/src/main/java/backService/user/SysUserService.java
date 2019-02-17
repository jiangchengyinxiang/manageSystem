package backService.user;

import backMapper.user.SysUserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class SysUserService {
	@Resource
	SysUserMapper userMapper;

	public void removeById(Integer id) {
		userMapper.removeById(id);
	}

	public void insert(SysUser record) {
		userMapper.insert(record);
	}

	public SysUser getUserById(Integer id) {
		return userMapper.getUserById(id);
	}
	public SysUser getUserByUserName(String userName){
		return userMapper.getUserByUserName(userName);
	}
    
	public SysUser getUserByPersonId(Integer personId) {
		return userMapper.getUserByPersonId(personId);
	}
	public SysUser login(@Param("userName") String userName, @Param("userPwd") String userPwd)
	{
		return userMapper.login(userName, userPwd);
	}
	public void updateById(SysUser record) {
		userMapper.updateById(record);
	}

	public List<SysUser> listByPara(HashMap<Object, Object> para) {
		return userMapper.listByPara(para);
	}
}
